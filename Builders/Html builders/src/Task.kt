fun renderProductTable(): String {
    return html {
        table {
            tr(getTitleColor()) {
                td {
                    text("Product")
                }
                td {
                    text("Price")
                }
                td {
                    text("Popularity")
                }
            }
            val products = getProducts()
            for (n in products.indices) {
                tr(getTitleColor()) {
                    td(getCellColor(n, 1)) {
                        text(products[n].description)
                    }
                    td(getCellColor(n, 2)) {
                        text(products[n].price)
                    }
                    td(getCellColor(n, 3)) {
                        text(products[n].popularity)
                    }
                }
            }

        }
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) = if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
