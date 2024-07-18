package org.example;


import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<Product> products = new ArrayList<>();
    public void addProduct(Product product) {
        if(product == null) {
            return;
        }
        if(product.getPrice()<0) {
            System.out.println("The price of the product is negative. Please enter a positive price.");
            return;
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public double getTotalPrice() {
        return products.size();
    }
    public List<Product> getProducts() {
        return products;
    }

    public int getProductCount() {
        return products.size();
    }
}
