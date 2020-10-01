package com.sujata.resource;

import com.sujata.bean.Orders;
import com.sujata.dao.AddonDAO;
import com.sujata.dao.CoffeeDAO;
import com.sujata.dao.DiscountDAO;
import com.sujata.dao.SizeDAO;
import com.sujata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderResources {
    @Autowired
    OrderService orderService;
    @Autowired
            CoffeeDAO coffeeDAO;
    @Autowired
    SizeDAO sizeDAO;
    @Autowired
    AddonDAO addonDAO;
    @Autowired
    DiscountDAO discountDAO;
    Orders order= new Orders();
    @GetMapping(path="/orders",produces="application/json")
    public void PlaceOrders() {
        System.out.println("Order has been placed");
    }
    @GetMapping(path="/orders/{oid}/{cid}/{aid}/{sid}/{did}",produces="application/json")
    public int getBill(@PathVariable("oid") int oid,@PathVariable("cid") int cid,@PathVariable("aid") int aid,@PathVariable("sid") int sid,@PathVariable("did") int did){
        Orders orders = new Orders(oid,cid,aid,sid,did);
       /* System.out.println("Order ID "+oid);
        System.out.println("Coffee "+coffeeDAO.findById(cid));
        System.out.println("Addon "+addonDAO.findById(aid));
        System.out.println("Size "+sizeDAO.findById(sid));
        System.out.println("Discount "+discountDAO.findById(did));*/
        return orderService.calculateBill(orders);
    }


}
