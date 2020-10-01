package com.sujata.dao;

import com.sujata.bean.Coffee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public interface CoffeeDAO extends CrudRepository<Coffee ,Integer> {
   // List<Coffee> getAllCoffeeRecords();
    //public int getCoffeePrice(int id);
}
