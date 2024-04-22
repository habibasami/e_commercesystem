package com.mycompany.ecommercesystem;
public class ElectronicProduct extends Product {
    private String brand;
    private int warrantyPeriod;
    public ElectronicProduct(String brand, int warrantyPeriod, int productId, float price, String name) {
        super(productId, price, name);
        this.brand = brand;
        this.warrantyPeriod = Math.abs( warrantyPeriod) ;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }
    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod=  Math.abs(warrantyPeriod) ;
       
    }
    
}
