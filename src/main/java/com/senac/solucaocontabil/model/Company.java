package com.senac.solucaocontabil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String cnpj;
    @Column(nullable = false)
    private String type;
    @Column(nullable = true)
    private String invoices;
    @OneToOne(mappedBy = "company", cascade = CascadeType.ALL)
    @Nullable
    private Asset assets;
    @OneToOne(mappedBy = "company", cascade = CascadeType.ALL)
    @Nullable
    private Liability liabilities;

    public Company(Long id, String name, String cnpj, String type, String invoices) {
        this.id = id;
        this.name = name;
        this.cnpj = cnpj;
        this.type = type;
        this.invoices = invoices;
    }
}

