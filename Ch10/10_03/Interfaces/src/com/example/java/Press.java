package com.example.java;

import com.example.java.model.Olive;
//sadece com.example.java.model package'deki
//Olive class implement edilmiþ

import java.util.List;

public interface Press {

    public int getOil(List<Olive> olives);
    public void setOil(int oil);

}
