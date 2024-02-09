package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.model.Asset;
import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.repository.AssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssetService {
    @Autowired
    private AssetRepository assetRepository;

    public List<Asset> findAll(){
        List<Asset> assetList = assetRepository.findAll();
        return assetList;
    }

    public Asset save(Asset asset){
        return assetRepository.save(asset);
    }
}
