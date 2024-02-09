package com.senac.solucaocontabil.repository;


import com.senac.solucaocontabil.model.Cash;
import com.senac.solucaocontabil.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Cash findByCash(Cash cash);
}
