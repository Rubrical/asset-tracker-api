package com.senac.solucaocontabil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Cash {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "balance")
    private Double balance;

    @OneToOne
    @PrimaryKeyJoinColumn(name = "company_id")
    private Company companyId;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "transaction_id", nullable = false)
    private List<Transaction> transactions;


}
