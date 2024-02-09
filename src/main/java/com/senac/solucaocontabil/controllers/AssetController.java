package com.senac.solucaocontabil.controllers;

import com.senac.solucaocontabil.model.Asset;
import com.senac.solucaocontabil.repository.AssetRepository;
import com.senac.solucaocontabil.services.AssetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("assets")
@RequiredArgsConstructor
public class AssetController {
    private AssetService assetService;

    @GetMapping
    public List<Asset> findAll(){
        List<Asset> assetList = assetService.findAll();
        return assetList;
    }


    public Asset save(@RequestBody Asset asset){
        Asset saved = assetService.save(asset);
        return saved;
    }
}
