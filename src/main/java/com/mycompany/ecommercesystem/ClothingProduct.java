package com.mycompany.ecommercesystem;
public class ClothingProduct extends Product{
    private String fabric;
    private String size;
    public ClothingProduct(String fabric, String size, int productId, float price, String name) {
        super(productId, price, name);
        this.fabric = fabric;
        this.size = size;
    }
    public String getFabric() {
        return fabric;
    }
    public void setFabric(String fabric) {
        this.fabric = fabric;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    
}
