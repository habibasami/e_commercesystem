 package com.mycompany.ecommercesystem;
 public class Order {
    private int customerId;
    private int orderId;
    Product[] products;
    float totalPrice;
    public Order(int customerId, int orderId, Product[] products, float totalPrice) {
        this.customerId =Math.abs(customerId)  ;
        this.orderId =Math.abs(orderId);
        this.products = products;
        this.totalPrice =  Math.abs(totalPrice);
    }
    public void  printOrderInfo(){
        System.out.println("customerId : "+ customerId);
        System.out.println("orderId : " + orderId);
        System.out.println("products : ");
        for(Product product : products){
            System.out.println(product.getName() + " - $"+ product.getPrice());
        }
        System.out.println("totalPrice : "+ totalPrice);
    }
     
}