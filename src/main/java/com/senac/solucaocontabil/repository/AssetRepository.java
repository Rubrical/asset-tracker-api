package com.senac.solucaocontabil.repository;

import com.senac.solucaocontabil.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetRepository extends JpaRepository<Asset, Long> {
}
