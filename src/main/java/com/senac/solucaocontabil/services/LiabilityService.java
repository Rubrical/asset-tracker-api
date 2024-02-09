package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.model.Liability;
import com.senac.solucaocontabil.repository.LiabilityRepository;
import org.springframework.stereotype.Service;

@Service
public class LiabilityService {
    private LiabilityRepository liabilityRepository;

    public Liability save(Liability liability) {
        return liabilityRepository.save(liability);
    }
}
