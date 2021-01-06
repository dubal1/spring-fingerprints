package com.everis.fingerprints.app.controller;

import com.everis.fingerprints.app.model.Dummy;
import com.everis.fingerprints.app.model.Person;
import com.everis.fingerprints.app.service.IFingerPrintsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@RestController
public class FingerPrintsController {
    /**
     * inject IFingerPrintsService.
     */
    @Autowired
    private IFingerPrintsService service;

    /**
     * @param person
     * @return savePerson.
     */
    @PostMapping(value = "/core/fingerprints/validate")
    public Mono<Dummy> savePerson(
            @Valid @RequestBody final Person person) {
        return service.savePersonConsumer(person);
    }
}
