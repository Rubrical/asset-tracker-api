package com.senac.solucaocontabil.controllers;

import com.senac.solucaocontabil.model.Cash;
import com.senac.solucaocontabil.services.CompanyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cash")
@RequiredArgsConstructor
public class CashController {
    private CompanyService companyService;

    @GetMapping("/{id}")
    public ResponseEntity<Cash> findById(Cash cash){
        Cash companyCash = companyService.getCompanyCash(cash);
        return ResponseEntity.ok(companyCash);
    }

    @PostMapping
    public ResponseEntity<Cash> save(Cash cash){
        Cash savedCash = companyService.saveCash(cash);
        return ResponseEntity.ok(savedCash);
    }
}
