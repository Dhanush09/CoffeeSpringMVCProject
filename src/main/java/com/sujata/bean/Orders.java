package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Orders {

    @Id
    private int order_id;
    private int coffee_id;
    private int size_id;
    private int addon_id;
    private int discount_id;

    public int getSize_id() {
        return size_id;
    }

    public void setSize_id(int size_id) {
        this.size_id = size_id;
    }

    public int getAddon_id() {
        return addon_id;
    }

    public void setAddon_id(int addon_id) {
        this.addon_id = addon_id;
    }

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public int getOrder_id() {
        return order_id;
    }

    public int getCoffee_id() {
        return coffee_id;
    }

    public void setCoffee_id(int coffee_id) {
        this.coffee_id = coffee_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }
    public Orders(int order_id, int coffee_id, int size_id, int addon_id, int discount_id) {
        this.order_id = order_id;
        this.coffee_id = coffee_id;
        this.size_id = size_id;
        this.addon_id = addon_id;
        this.discount_id = discount_id;
    }

    public Orders() {
    }


    @Override
    public String toString() {
        return "Order{" +
                "order_id='" + order_id + '\'' +
                '}';
    }
}
