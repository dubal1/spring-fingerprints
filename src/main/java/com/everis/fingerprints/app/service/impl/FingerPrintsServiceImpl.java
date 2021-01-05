package com.everis.fingerprints.app.service.impl;

import com.everis.fingerprints.app.dto.Person;
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
    public Mono<Person> savePersonConsumer(final Person person) {
        return repository.savePerson(person);
    }

}
