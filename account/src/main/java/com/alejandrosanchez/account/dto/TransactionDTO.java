package com.alejandrosanchez.account.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TransactionDTO {
    private LocalDateTime date;
    private String type;
    private double amount;
    private double balanceAfter;
}
