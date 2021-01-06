package com.everis.fingerprints.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Person {
    /**
     * field id.
     */
    private String id;
    /**
     * field document.
     */
    @NotEmpty(message = "El campo 'document' no debe ser vacío")
    @Size(min = 8, max = 8, message = "El campo 'document' debe tener 8 caracteres")
    private String document;
    /**
     * field fingerprints.
     */
    private Boolean fingerprint;
    /**
     * field blacklist.
     */
    private Boolean blacklist;
}
