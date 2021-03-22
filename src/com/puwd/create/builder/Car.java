package com.puwd.create.builder;

import java.math.BigDecimal;

/**
 * 车
 * @author puwd
 * @date 2020/11/23 17:03
 * 参数设置提供构造方法及set方法，另外提供构造者模式设置属性，可使用外部类也可使用内部类
 */
public class Car {

    private String brand;

    private String model;

    private String color;

    private Integer capacity;

    private BigDecimal price;

    public Car() {

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Car(String brand, String model, String color, Integer capacity, BigDecimal price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.capacity = capacity;
        this.price = price;
    }

    public static class InnerCarBuilder{

        private String brand;

        private String model;

        private String color;

        private Integer capacity;

        private BigDecimal price;

        public InnerCarBuilder brand(String brand){
            this.brand = brand;
            return this;
        }

        public InnerCarBuilder model(String model){
            this.model = model;
            return this;
        }

        public InnerCarBuilder color(String color){
            this.color = color;
            return this;
        }

        public InnerCarBuilder capacity(Integer capacity){
            this.capacity = capacity;
            return this;
        }

        public InnerCarBuilder price(BigDecimal price){
            this.price = price;
            return this;
        }

        public Car build(){
            return new Car(this.brand,this.model,this.color,this.capacity,this.price);
        }
    }
}
