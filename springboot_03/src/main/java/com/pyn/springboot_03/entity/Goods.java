package com.pyn.springboot_03.entity;

public class Goods {
    private int id;
    private String name;
    private double price;
    private String des;
    public Goods() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Goods(int id, String name, double price, String des) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
        this.des = des;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getDes() {
        return des;
    }
    public void setDes(String des) {
        this.des = des;
    }
    @Override
    public String toString() {
        return "goods [id=" + id + ", name=" + name + ", price=" + price + ", des=" + des + "]";
    }
}
