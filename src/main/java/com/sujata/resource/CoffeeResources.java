package com.sujata.resource;

import com.sujata.bean.*;
import com.sujata.service.*;
import com.sujata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class CoffeeResources {
    @Autowired
    private CoffeeService coffeeService;
    @Autowired
    private SizeService sizeService;
    @Autowired
    private AddonService addonService;
    @Autowired
    private DiscountService discountService;
    @Autowired
    private OrderService orderService;
   // @Autowired
    Orders orders = new Orders();

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path="/coffees",produces="application/json")
    public List<Coffee> getAllCoffees(){
        return coffeeService.getAllCoffee();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path="/coffees/{id}",produces="application/json")
    public int getCoffeePriceById(@PathVariable("id") int id){
        return coffeeService.getCoffeeBill(id);
    }

}
