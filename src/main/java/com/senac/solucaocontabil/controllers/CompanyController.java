package com.senac.solucaocontabil.controllers;

import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("companies")
@RequiredArgsConstructor
public class CompanyController {
    private final CompanyService companyService;

    @GetMapping
    public List<Company> list(){
        List<Company> listedAll = companyService.listAll();
        return listedAll;
    }

}
