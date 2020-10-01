package com.sujata.service;

import com.sujata.bean.Coffee;
import com.sujata.bean.CoffeeSize;

import java.util.List;

public interface SizeService {
    public List<CoffeeSize> getAllSize();
    public int getSizeBill(int id);
}
