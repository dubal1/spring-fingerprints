package com.everis.fingerprints.app.service;

import com.everis.fingerprints.app.model.Dummy;
import com.everis.fingerprints.app.model.Person;
import reactor.core.publisher.Mono;

public interface IFingerPrintsService {
    /**
     *
     * @param person
     * @return savePersonConsumer.
     */
    Mono<Dummy> savePersonConsumer(Person person);
}
