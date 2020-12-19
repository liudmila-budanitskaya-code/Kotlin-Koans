// Return the sum of prices for all the products ordered by a given customer
fun moneySpentBy(customer: Customer): Double {

    var sum = 0.0
    for (it in customer.orders) {
        for (it in it.products) {
            sum += it.price
        }
    }
    return sum

}





