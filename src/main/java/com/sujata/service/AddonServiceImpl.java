package com.sujata.service;

import com.sujata.bean.Coffee;
import com.sujata.bean.CoffeeAddOns;
import com.sujata.dao.AddonDAO;
import com.sujata.dao.CoffeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AddonServiceImpl implements AddonService{
    @Autowired
    private AddonDAO addonDAO;
    @Override
    public List<CoffeeAddOns> getAllAddons() {
        return (List<CoffeeAddOns>)addonDAO.findAll();

    }

    @Override
    public int getAddonBill(int id) {
        CoffeeAddOns coffeeAddOns = addonDAO.findById(id).get();
        return coffeeAddOns.getAddon_price();
    }

}
