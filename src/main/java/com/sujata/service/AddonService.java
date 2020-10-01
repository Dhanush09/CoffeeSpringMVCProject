package com.sujata.service;

import com.sujata.bean.Coffee;
import com.sujata.bean.CoffeeAddOns;

import java.util.List;

public interface AddonService {
    public List<CoffeeAddOns> getAllAddons();
    public int getAddonBill(int id);
}
