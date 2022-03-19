package com.raju.q2;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> arr = new ArrayList<>();
        int count = 1;
        while(count<=2){
            System.out.println("Enter product "+count+" details :");
            System.out.println("Enter product id :");
            int prodID = sc.nextInt();
            System.out.println("Enter product name :");
            String prodName = sc.next();
            System.out.println("Enter product price :");
            double prodPrice = sc.nextInt();
            arr.add(new Product(prodID,prodName,prodPrice));
            count++;
        }
        System.out.println("Enter sorting order as 1 by price, 2 by name, 3 by id");
        int sortOrder = sc.nextInt();
        TreeSet<Product> products;
        if(sortOrder==1)
            products = new TreeSet<>(new ProductPriceComparator());
        else if(sortOrder==2)
            products = new TreeSet<>(new ProductNameComparator());
        else
            products = new TreeSet<>(new ProductIdComparator());
        products.addAll(arr);
        for (Product p:products)
            System.out.println(p);
    }
}
