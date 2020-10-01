package com.sujata.service;

import com.sujata.bean.Coffee;
import com.sujata.dao.CoffeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CoffeeServiceImpl implements CoffeeService{
    @Autowired
    private CoffeeDAO coffeeDAO;
    @Override
    public List<Coffee> getAllCoffee() {
        return  (List<Coffee>)coffeeDAO.findAll();
    }

    @Override
    public int getCoffeeBill(int id) {
        Coffee coffee = coffeeDAO.findById(id).get();
        return coffee.getCoffee_price();
    }
}
