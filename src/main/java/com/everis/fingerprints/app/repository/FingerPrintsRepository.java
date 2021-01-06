package com.everis.fingerprints.app.repository;

import com.everis.fingerprints.app.model.Person;
import reactor.core.publisher.Mono;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface FingerPrintsRepository {

    /**
     *
     * @param person .
     * @return savePerson.
     */
    @POST("/core/persons")
    Mono<Person> savePerson(@Body Person person);
}
