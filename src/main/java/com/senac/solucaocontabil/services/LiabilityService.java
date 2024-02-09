package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.model.Liability;
import com.senac.solucaocontabil.repository.LiabilityRepository;
import org.springframework.stereotype.Service;

@Service
public class LiabilityService {
    private LiabilityRepository liabilityRepository;

    public Liability save(Company company, Liability liability){
        liability.setCompany(company);
        return liabilityRepository.save(liability);
    }
}
