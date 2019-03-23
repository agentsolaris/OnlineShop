package com.eduard;

import java.util.Scanner;

public class Product {
    private String name;
    private int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
        this.name = "";
        this.price = 0;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public void readProductData()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Name? ");
        this.name=sc.next();
        System.out.println("Price? ");
        this.price=sc.nextInt();
    }
}
