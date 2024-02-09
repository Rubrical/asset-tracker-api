package com.senac.solucaocontabil.controllers;

import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<Company> findById(@PathVariable Long id){
        return ResponseEntity.ok(companyService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Company> save(@RequestBody Company company){
        Company saved = companyService.save(company);
        return ResponseEntity.ok(saved);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Company> update(@PathVariable Long id, @RequestBody Company updatedCompany){
        return ResponseEntity.ok(companyService.update(id, updatedCompany));
    }
}
