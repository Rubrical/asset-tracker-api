package com.senac.solucaocontabil.repository;

import com.senac.solucaocontabil.model.Cash;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashRepository extends JpaRepository<Cash, Long> {
}
