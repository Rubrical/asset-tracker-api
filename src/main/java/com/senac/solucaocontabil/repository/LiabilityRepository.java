package com.senac.solucaocontabil.repository;

import com.senac.solucaocontabil.model.Liability;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LiabilityRepository extends JpaRepository<Liability, Long> {
}
