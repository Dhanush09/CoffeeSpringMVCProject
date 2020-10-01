package com.sujata.dao;


import com.sujata.bean.Orders;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
@Repository
public interface OrderDAO extends CrudRepository<Orders , Integer> {
    //void insertOrder(Orders order, int coffee_id, int size_id, int addon_id, int discount_id);
    @Query("select max(order_id) from Orders")
    int getMaxOrderId();
}
