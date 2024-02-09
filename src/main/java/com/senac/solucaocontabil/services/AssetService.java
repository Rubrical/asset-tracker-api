package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.model.Asset;
import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssetService {
    @Autowired
    private AssetRepository assetRepository;

    public Asset save(Company company, Asset asset){
        return assetRepository.save(asset);
    }
}
