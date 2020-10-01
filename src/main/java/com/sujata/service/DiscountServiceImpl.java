package com.sujata.service;

import com.sujata.bean.CoffeeAddOns;
import com.sujata.bean.Discount;
import com.sujata.dao.AddonDAO;
import com.sujata.dao.DiscountDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired
    private DiscountDAO discountDAO;
    @Override
    public List<Discount> getAllDiscount() {
        return (List<Discount>)discountDAO.findAll();

    }

    @Override
    public int getDiscountBill(int id) {
        Discount discount= discountDAO.findById(id).get();
        return discount.getDiscount();
    }
}
