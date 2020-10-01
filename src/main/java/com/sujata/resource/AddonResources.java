package com.sujata.resource;

import com.sujata.bean.CoffeeAddOns;
import com.sujata.service.AddonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddonResources {
    @Autowired
    private AddonService addonService;
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(path="/addons",produces="application/json")
    public List<CoffeeAddOns> getAllAddons() {
        return addonService.getAllAddons();
    }
    @GetMapping(path="/addons/{id}",produces="application/json")
    public int getAddonPriceById(@PathVariable("id") int id){
        return addonService.getAddonBill(id);
    }
}
