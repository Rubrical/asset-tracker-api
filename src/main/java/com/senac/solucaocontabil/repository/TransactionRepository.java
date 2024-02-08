package com.senac.solucaocontabil.repository;

import com.senac.solucaocontabil.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {
}
