package org.example;

import org.example.Cart;
import org.example.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CartTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach

    void setUp() {
        cart = new Cart();
        product1 = new Product("1", "Laptop", 999.999);
        product2 = new Product("2", "SmartPhone", 665.434);
    }

    @Test

    void testAddProduct() {
        cart.addProduct(product1);
        assertEquals(1, cart.getProductCount());
        assertTrue(cart.getProducts().contains(product1));
    }

    @Test

    void testRemoveProduct() {
        cart.addProduct(product1);
        cart.removeProduct(product1);
        assertEquals(0, cart.getProductCount());
        assertFalse(cart.getProducts().contains(product1));
    }

    @Test

    void testGetTotalPrice() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        double expectedTotalPrice = product1.getPrice() + product2.getPrice();
        assertEquals(expectedTotalPrice, cart.getTotalPrice());
    }
}