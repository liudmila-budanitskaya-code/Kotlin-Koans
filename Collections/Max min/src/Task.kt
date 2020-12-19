// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders(): Customer? =
        customers.maxBy { it.orders.size }

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer): Product? {
    val productList = mutableListOf<Product>()
    for (it in customer.orders) {
        for (it in it.products) {
            productList.add(it)
        }
    }
    return productList.maxBy(Product::price)

}
