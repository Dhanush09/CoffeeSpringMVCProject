package com.sujata.resource;

import com.sujata.bean.CoffeeSize;
import com.sujata.bean.Discount;
import com.sujata.service.DiscountService;
import com.sujata.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiscountResource {
    @Autowired
    private DiscountService discountService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path="/discount",produces="application/json")
    public List<Discount> getAllDiscount(){
        return discountService.getAllDiscount();
    }
    @GetMapping(path="/discount/{id}",produces="application/json")
    public int getDiscountPriceById(@PathVariable("id") int id){
        return discountService.getDiscountBill(id);
    }
}
