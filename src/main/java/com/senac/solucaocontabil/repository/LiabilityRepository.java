package com.senac.solucaocontabil.repository;

import com.senac.solucaocontabil.model.Liabilities;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiabilityRepository extends JpaRepository<Liabilities, Long> {
}
