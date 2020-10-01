package com.sujata.dao;

import com.sujata.bean.Discount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public interface DiscountDAO extends CrudRepository<Discount,Integer> {
    //List<Discount> getAllDiscountRecords();

   // public int searchDiscount(int id) ;
}
