package com.alejandrosanchez.account.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Account extends Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "El número de cuenta es obligatorio")
    @Column(unique = true, nullable = false)
    @JsonProperty("numeroCuenta")
    private String accountNumber;

    @NotBlank(message = "El tipo de cuenta es obligatorio")
    @Column(nullable = false)
    @JsonProperty("tipoCuenta")
    private String accountType;

    @PositiveOrZero(message = "El saldo inicial no puede ser negativo")
    @Column(nullable = false)
    @JsonProperty("balanceInicial")
    private double initialBalance;

    @NotNull(message = "El ID del cliente es obligatorio")
    @Column(nullable = false)
    @JsonProperty("clienteId")
    private Long clientId;

}