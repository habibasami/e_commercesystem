 package com.mycompany.ecommercesystem;
 public class Product {
    private int productId;
    private float price;
    private  String name;
    public int getProductId() {
        return productId;
    }
    public Product(int productId, float price, String name) {
        this.productId = productId;
        this.price = price;
        this.name = name;
    }
    public Product() {
    }
    public void setProductId(int productId) {
        this.productId= Math.abs(productId) ;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price= Math.abs(price);
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
