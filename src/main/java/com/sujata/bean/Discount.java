package com.sujata.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Discount {
    private String dis_code;
    private int discount;
    @Id
    private int discount_id;

    public int getDiscount_id() {
        return discount_id;
    }

    public void setDiscount_id(int discount_id) {
        this.discount_id = discount_id;
    }

    public String getDis_code() {
        return dis_code;
    }

    public void setDis_code(String dis_code) {
        this.dis_code = dis_code;
    }

    public int getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Discount{" +
                "dis_code='" + dis_code + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Discount(String dis_code, int discount) {
        this.dis_code = dis_code;
        this.discount = discount;
    }

    public Discount() {

    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
