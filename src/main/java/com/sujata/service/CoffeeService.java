package com.sujata.service;

import com.sujata.bean.Coffee;

import java.util.List;

public interface CoffeeService {
    public List<Coffee> getAllCoffee();
    public int getCoffeeBill(int id);
}
