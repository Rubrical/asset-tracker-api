package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;
    public List<Company> listAll() {
        return companyRepository.findAll();
    }

    public Company findById(long id) {
        return companyRepository.findById(id).orElseThrow(
                () -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Empresa não encontrada")
        );
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }


    public Company update(Long id, Company updatedCompany) {
        Company company = findById(id);

        company.setName(updatedCompany.getName());
        company.setCnpj(updatedCompany.getCnpj());
        company.setType(updatedCompany.getType());
        company.setInvoices(updatedCompany.getInvoices());

        return companyRepository.save(company);

    }
}
