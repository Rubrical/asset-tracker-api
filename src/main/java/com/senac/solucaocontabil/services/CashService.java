package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.repository.CashRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CashService {
    @Autowired
    private CashRepository cashRepository;



}
