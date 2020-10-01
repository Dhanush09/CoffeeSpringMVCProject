package com.sujata.service;

import com.sujata.bean.*;
import com.sujata.bean.Orders;
import com.sujata.dao.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManagerFactory;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{

    private int coffee;
    private int coffeeSize;
    private int coffeeAddOns;
    private int discount;
    private int bill=0;
@Autowired
OrderDAO orderDAO;

    @Autowired
    CoffeeService coffeeService;
    @Autowired
    SizeService sizeService;
    @Autowired
    AddonService addonService;
    @Autowired
    DiscountService discountService;
    @Override
    public int calculateBill(Orders order) {


        coffee=coffeeService.getCoffeeBill(order.getCoffee_id());
        System.out.println("Coffee price: " + coffee);
        bill += coffee;
        coffeeAddOns = addonService.getAddonBill(order.getAddon_id());
        System.out.println("Addon price: " + coffeeAddOns);
        bill += coffeeAddOns;
        coffeeSize = sizeService.getSizeBill(order.getSize_id());
        System.out.println("Size price: " + coffeeSize);
        bill += coffeeSize;
        discount = discountService.getDiscountBill(order.getDiscount_id());
        System.out.println("Discount: " + discount);
        bill = bill - discount;
        //(order, order.getCoffee_id(), order.getSize_id(), order.getAddon_id(), order.getDiscount_id());
        return bill;
    }

   /* @Override
    public List getDetails(Orders order) {
        SessionFactory sessionFactory=entityManagerFactory.unwrap(SessionFactory.class);
        Session session =sessionFactory.openSession();
        Query query=session.createQuery("from Orders ");
        List<Orders> coffees=query.getResultList();
        System.out.println(coffees);
        session.close();
        return coffees;
    }*/

    @Override
    public void placeOrders(Orders order) {
        Coffee coffee = coffeeService.getAllCoffee().get(order.getCoffee_id());
        CoffeeSize coffeeSize = sizeService.getAllSize().get(order.getSize_id());
        CoffeeAddOns addOns = addonService.getAllAddons().get(order.getAddon_id());
        Discount discount = discountService.getAllDiscount().get(order.getDiscount_id());
        //int order_id=orderDAO.getMaxOrderId()+1;
       // Orders orders = new Orders(order_id, coffee.getCoffee_id(), coffeeSize.getSize_id(), addOns.getAddon_id(), discount.getDiscount_id());
        orderDAO.save(order);
    }
}
