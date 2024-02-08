package com.senac.solucaocontabil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String cnpj;
    private String type;
    private String invoices;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "asset_id")
    private Asset assetModel;
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "liability_id")
    private Liabilities liabilities;
}

