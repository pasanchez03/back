package com.alejandrosanchez.account.dto;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class AccountReportDTO {
    private Long clientId;
    private List<AccountDetailsDTO> accounts;
}

