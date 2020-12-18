data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    init {
        require(year in 1..2020 && month in 1..12 && dayOfMonth in 1..31)
    }

    override fun compareTo(other: MyDate): Int {
        val thisNumber: Int = 360 * this.year + 12 * this.month + this.dayOfMonth
        val otherNumber: Int = 360 * other.year + 12 * other.month + other.dayOfMonth
        return when {
            thisNumber > otherNumber -> {
                1
            }
            thisNumber == otherNumber -> {
                0
            }
            else -> {
                -1
            }
        }
    }


}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
