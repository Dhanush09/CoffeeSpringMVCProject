package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Coffee {
    @Id
    private int coffee_id;
    private String coffee_name;
    public int coffee_price;

    public Coffee() {

    }

    @Override
    public String toString() {
        return "Coffee{" +
                "coffee_name='" + coffee_name + '\'' +
                ", coffee_id=" + coffee_id +
                ", coffee_price=" + coffee_price +
                '}';
    }

    public String getCoffee_name() {
        return coffee_name;
    }

    public void setCoffee_name(String coffee_name) {
        this.coffee_name = coffee_name;
    }

    public int getCoffee_id() {
        return coffee_id;
    }

    public void setCoffee_id(int coffee_id) {
        this.coffee_id = coffee_id;
    }

    public int getCoffee_price() {
        return coffee_price;
    }

    public void setCoffee_price(int coffee_price) {
        this.coffee_price = coffee_price;
    }

    public Coffee(String coffee_name, int coffee_id, int coffee_price) {
        this.coffee_name = coffee_name;
        this.coffee_id = coffee_id;
        this.coffee_price = coffee_price;
    }
}
