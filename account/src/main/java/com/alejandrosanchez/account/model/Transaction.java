package com.alejandrosanchez.account.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import lombok.Setter;
import lombok.Getter;

@Getter
@Setter
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    @JsonProperty("fecha")
    private LocalDateTime date;

    @JsonProperty("tipoTransaccion")
    private String transactionType;

    @JsonProperty("monto")
    private double amount;

    @JsonProperty("balance")
    private double balance;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    @JsonProperty("cuenta")
    private Account account;

}