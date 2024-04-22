package com.mycompany.ecommercesystem;
public class Cart {
    private int customerId;
    private int nProducts;
    private Product[] products=new Product[nProducts];
    public Cart(int customerId, int nProducts) {
        this.customerId = Math.abs(customerId) ;
        this.nProducts = Math.abs(nProducts) ;
        this.products = new Product[nProducts];
    }
    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId= Math.abs(  customerId) ;
    }
    public int getnProducts() {
        return nProducts;
    }
    public void setnProducts(int nProducts) {
        this.nProducts= Math.abs(nProducts) ;
    }
    public Product[] getProducts() {
        return products;
    }
    public void setProducts(Product[] products) {
        this.products=products;
    }
     int i=0;
    public void addProducts(Product product) {
        products[i]=product;
        i++;
    }
    public void removeProduct(Product  product, int n ){
        if(product==this.products[n])
            product=null; 
        else
            System.out.println("not find this product ");
    }
    public   float  calculatePrice() {
        float total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
         float totalPrice=total;
        return totalPrice ;
    }
    public Order placeOrder(){
        float totalPrice= calculatePrice();
       int orderId = (int)(Math.random()*1000);
       Order order= new Order(customerId,orderId,products,totalPrice);
       order.printOrderInfo();
       return order;
    }
}
