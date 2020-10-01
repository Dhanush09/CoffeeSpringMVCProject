package com.sujata.dao;

import com.sujata.bean.CoffeeSize;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public interface SizeDAO extends CrudRepository<CoffeeSize,Integer> {
    //List<CoffeeSize> getAllSizeRecords();

    //public int getSizePrice(int id);
}
