// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {

    val productList = customers.flatMap { it.getOrderedProducts() }.toSet()

    return customers.fold(productList, operation = { orderByAll, customer -> orderByAll.intersect(customer.getOrderedProducts()) })
}

// Return all products the given customer has ordered
fun Customer.getOrderedProducts(): List<Product> =
        orders.flatMap(Order::products)