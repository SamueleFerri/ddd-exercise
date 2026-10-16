## Main concepts

1. Order (entity)
    + serial number (id)
    + instant
    + products : Map<Product, Integer>
    + totalPrice
2. SerialNumber | OrderID
3. repository of Orders
4. service for managing orders
5. domain events
    6. order submitted | performed
    7. order concluded
    8. order canceled
    9. ...