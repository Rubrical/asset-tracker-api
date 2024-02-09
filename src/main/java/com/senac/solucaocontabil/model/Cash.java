package com.senac.solucaocontabil.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "cache", schema = "api")
public class Cash {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "balance", nullable = false)
    private String balance;

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "company_id", referencedColumnName = "id", nullable = false)
//    private Company company;
}