package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CartEdgeCaseTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @BeforeEach

    void setUp() {
        cart = new Cart();
        product1 = new Product("1", "Laptop", 999.99);
        product2 = new Product("2", "SmartPhone", 665.434);
    }

    @Test

    void testAddNullProduct() {
        cart.addProduct(null);
        assertEquals(0, cart.getProductCount(), "Cart should not add null products");
    }

    @Test

    void testRemoveNonExistentProduct() {
        cart.addProduct(product1);
        cart.removeProduct(product2);
        assertEquals(1, cart.getProductCount(), "Cart shoud still contain the originally added product");
        assertTrue(cart.getProducts().contains(product1));
    }

    @Test

    void testGetTotalPriceWithNoProducts() {
        assertEquals(0.0, cart.getTotalPrice(), "Total price should be 0.0 when cart is empty");
    }

    @Test

    void testAddMultipleProductsSameId() {
        Product anotherProduct1 = new Product("1", "Laptop", 999.99);
        cart.addProduct(product1);
        cart.addProduct(anotherProduct1);
        assertEquals(2,cart.getProductCount(), "Cart should allow adding multiple products with the same Id");
    }

    @Test

    void testHandlingEdgeCasePrices() {
            Product freeProduct = new Product("3", "Freebie", 0.0);
            Product negativePriceProduct = new Product("4", "Negative Price item", -10.0);

            cart.addProduct(freeProduct);
            cart.addProduct(negativePriceProduct);

            double expectedTotal = freeProduct.getPrice() + negativePriceProduct.getPrice();
            assertNotEquals(expectedTotal, cart.getTotalPrice(), "Total price should handle 0.0 and negative values correctly");
        }
    }

