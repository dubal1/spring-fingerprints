package com.everis.fingerprints.app.service.impl;

import com.everis.fingerprints.app.model.Dummy;
import com.everis.fingerprints.app.model.Person;
import com.everis.fingerprints.app.repository.FingerPrintsRepository;
import com.everis.fingerprints.app.service.IFingerPrintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class FingerPrintsServiceImpl implements IFingerPrintsService {
    /**
     * inject FingerPrintsRepository.
     */
    @Autowired
    private FingerPrintsRepository repository;

    /**
     *
     * @param person
     * @return savePersonConsumer.
     */
    @Override
    public Mono<Dummy> savePersonConsumer(final Person person) {
        return repository.savePerson(person)
                .filter(p -> !p.getBlacklist() && p.getFingerprint())
                .map(per -> new Dummy("Core", true));
    }
}
