package com.everis.fingerprints.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Dummy {
    /**
     * field entityName.
     */
    private String entityName;
    /**
     * field success.
     */
    private Boolean success;
}
