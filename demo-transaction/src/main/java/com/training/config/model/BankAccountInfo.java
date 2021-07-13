package com.training.config.model;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BankAccountInfo {
    private Long id;
    private String fullName;
    private double balance;
}
