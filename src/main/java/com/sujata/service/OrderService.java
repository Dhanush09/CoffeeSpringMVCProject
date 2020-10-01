package com.sujata.service;

import com.sujata.bean.Orders;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public interface OrderService {
    public int calculateBill(Orders order);
    //public List getDetails(Orders order);
    public void placeOrders(Orders order);
}
