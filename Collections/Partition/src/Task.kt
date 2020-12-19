// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders(): Set<Customer> {

   val(undelivered, delivered) = customers.partition { it.orders.filter {it.isDelivered}.size < it.orders.filter {!it.isDelivered}.size}
   return undelivered.toSet()

   // customers.partition { it.orders.filter {it.isDelivered}.size}
    //  в фигурных скобках должно быть булевское выражение,
    // если больше недоставленных заказов, чем доставленных
    /*
    функция, рассчитывающая, у данного покупателя больше
    недоставленных заказов,
    или доставленных
    Количество доставленных заказов:
    it.orders.filter {it.isDelivered}.size
     */
}


// more undelivered orders than delivered orders