package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.model.Asset;
import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.model.Liability;
import com.senac.solucaocontabil.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    public List<Company> listAll(){
        return companyRepository.findAll();
    }

    public Company save(Company company){
        return companyRepository.save(company);
    }


}
