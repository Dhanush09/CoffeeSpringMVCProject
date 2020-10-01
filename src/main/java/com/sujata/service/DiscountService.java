package com.sujata.service;

import com.sujata.bean.CoffeeAddOns;
import com.sujata.bean.Discount;

import java.util.List;

public interface DiscountService {
    public List<Discount> getAllDiscount();
    public int getDiscountBill(int id);
}
