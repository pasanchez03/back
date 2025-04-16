package com.alejandrosanchez.account.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountDetailsDTO {
    private String accountNumber;
    private String accountType;
    private double balance;
    private List<TransactionDTO> transactions;
}
