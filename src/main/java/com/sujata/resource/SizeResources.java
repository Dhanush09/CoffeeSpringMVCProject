package com.sujata.resource;

import com.sujata.bean.CoffeeAddOns;
import com.sujata.bean.CoffeeSize;
import com.sujata.service.AddonService;
import com.sujata.service.SizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class SizeResources {
    @Autowired
    private SizeService sizeService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path="/sizes",produces="application/json")
    public List<CoffeeSize> getAllSizes(){
        return sizeService.getAllSize();
    }
    @GetMapping(path="/sizes/{id}",produces="application/json")
    public int getSizePriceById(@PathVariable("id") int id){
        return sizeService.getSizeBill(id);
    }
}
