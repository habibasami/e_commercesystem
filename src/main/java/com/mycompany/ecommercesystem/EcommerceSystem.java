
package com.mycompany.ecommercesystem;

import java.util.Scanner;

public class EcommerceSystem {

    public static void main(String[] args) {
        Scanner hs=new Scanner(System.in);
        Product p=new Product();
        ElectronicProduct  e_p =new ElectronicProduct(" Samsung",1,1,599.99f,"Smartphone");
        ClothingProduct  c_p=new  ClothingProduct("Cotton","Medium",2,19.99f,"T-shirt");
        BookProduct  b_p=new BookProduct("O’Reilly"," x Publications",3,39.99f,"oop");
        System.out.println("Welcome to the E-commerce system!");
        System.out.println("Enter your id:");
        int customerId=hs.nextInt();
        System.out.println("Enter your name:");
        String name=hs.next();
        System.out.println("Enter your  address:");
        String  address=hs.next();
        Customer customer=new Customer(name,address,customerId);
        System.out.println("How many products  you want to  add to your cart ?");
        int nProducts=hs.nextInt();
        Cart cart = new Cart(customerId,nProducts);
      
        int x=1;
        while (x<=nProducts){
            System.out.println("Which product would you like to add? 1:Smartphone , 2:T-shirt , 3:Oop");
            int n =hs.nextInt();
            switch(n){
                case 1:
                    cart.addProducts(e_p);
                    break;
                case 2:
                    cart.addProducts( c_p);
                    break;
                case 3:
                    cart.addProducts( b_p);
                    break;
            }  
            x+=1;  
        }
        System.out.print( " your total is"+cart.calculatePrice() );
        System.out.println("  Would you like to place the order ?1:yes , 2:no");
        int placeOrder =hs.nextInt();
        if (placeOrder==1){
            System.out.println("Here is your order is summary:");
            cart.placeOrder();
        }
    }
}
