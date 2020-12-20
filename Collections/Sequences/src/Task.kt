// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer): Product? {
    return customer.orders
            .asSequence()
            .filter { it.isDelivered }
            .map { it -> it.products }
            .flatten()
            .maxBy { product -> product.price }
}

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.

fun Shop.getNumberOfTimesProductWasOrdered(product: Product) = customers
        .asSequence()
        .map { it.orders }
        .flatten()
        .map { it.products }
        .flatten()
        .count { it == product }


fun Customer.getOrderedProducts(): List<Product> =
        orders.asSequence()
                .map { it.products }
                .asSequence()
                .flatten()
                .toList()