package com.senac.solucaocontabil.services;

import com.senac.solucaocontabil.model.Asset;
import com.senac.solucaocontabil.model.Company;
import com.senac.solucaocontabil.model.Liability;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {
    public List<Company> listAll(){
        ArrayList<Company> companies = new ArrayList<>();
        Asset one = new Asset(1L, "entrada", 10D);
        Liability two = new Liability(1L, "saida", 5D);
        Company gonorrei = new Company(
                1L,
                "Gonorreia ltda",
                "46681867000150",
                "limitada",
                null
        );

        companies.add(gonorrei);
        return companies;
    }


}
