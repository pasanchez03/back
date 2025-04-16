package com.alejandrosanchez.account.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ClientDTO {
    private Long id;
    @JsonProperty("nombre")
    private String name;
    @JsonProperty("identificacion")
    private String identification;
    @JsonProperty("estado")
    private Boolean active;
}
