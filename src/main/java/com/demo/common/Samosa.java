package com.demo.common;

public class Samosa {
    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        System.out.println("Setting Price");
        this.price = price;
    }

    public Samosa() {

    }

    @Override
    public String toString() {
        return "Samosa{" +
                "price=" + price +
                '}';
    }
    public void init(){
        System.out.println("Inside init Method");
    }
    public void destroy(){
        System.out.println("Inside destroy Method");
    }
}
