package it.unibo.ddd.exercises.orders;

import it.unibo.ddd.exercises.customers.CustomerID;
import it.unibo.ddd.exercises.money.Money;
import it.unibo.ddd.exercises.products.ProductID;

import java.util.Map;

public interface Order {
    SerialNumber getId();
    CustomerID getCustomer();
    Map<ProductID, Integer> getProducts();
    Money getTotal();

    void addProduct(ProductID productID, int quantity);
    void removeProduct(ProductID productID, int quantity);
}
