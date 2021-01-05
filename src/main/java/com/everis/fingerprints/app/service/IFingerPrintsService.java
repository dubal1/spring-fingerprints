package com.everis.fingerprints.app.service;

import com.everis.fingerprints.app.dto.Person;
import reactor.core.publisher.Mono;

public interface IFingerPrintsService {
    /**
     *
     * @param person
     * @return savePersonConsumer.
     */
    Mono<Person> savePersonConsumer(Person person);
}
