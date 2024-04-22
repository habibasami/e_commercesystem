package com.mycompany.ecommercesystem;
public class BookProduct extends Product{
    private String  author;
    private String publisher;
    public BookProduct(String author, String publisher, int productId, float price, String name) {
        super(productId, price, name);
        this.author = author;
        this.publisher = publisher;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
}
