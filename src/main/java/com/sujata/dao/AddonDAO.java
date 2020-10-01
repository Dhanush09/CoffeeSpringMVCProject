package com.sujata.dao;

import com.sujata.bean.Coffee;
import com.sujata.bean.CoffeeAddOns;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Repository
public interface AddonDAO extends CrudRepository<CoffeeAddOns,Integer> {
   // List<CoffeeAddOns> getAllAddonsRecords();
    //public int searchAddOns(int addonID);
  //  @Query("from CoffeeAddOns ")
   // CoffeeAddOns getCoffeeAddOnsByAddon();

}
