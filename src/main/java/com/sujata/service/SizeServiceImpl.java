package com.sujata.service;

import com.sujata.bean.Coffee;
import com.sujata.bean.CoffeeSize;
import com.sujata.dao.CoffeeDAO;
import com.sujata.dao.SizeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SizeServiceImpl implements SizeService {
    @Autowired
    private SizeDAO sizeDAO;
    @Override
    public List<CoffeeSize> getAllSize() {
        return  (List<CoffeeSize>)sizeDAO.findAll();

    }

    @Override
    public int getSizeBill(int id) {
       CoffeeSize coffeeSize = sizeDAO.findById(id).get();
       return coffeeSize.getSize_price();
    }
}
