import java.util.*

/*fun <T, C : MutableCollection<in T>> Array<out T>.partitionTo(// где тут условие?
    destination: C
): C {
    this.partition { it. }
    return C()
}

fun partitionWordsAndLines() {
    val (words, lines) = listOf("a", "a b", "c", "d e")
        .partitionTo(ArrayList(), ArrayList()) { s -> !s.contains(" ") }
    check(words == listOf("a", "c"))
    check(lines == listOf("a b", "d e"))
}

fun partitionLettersAndOtherSymbols() {
    val (letters, other) = setOf('a', '%', 'r', '}')
        .partitionTo(HashSet(), HashSet()) { c -> c in 'a'..'z' || c in 'A'..'Z' }
    check(letters == setOf('a', 'r'))
    check(other == setOf('%', '}'))
}*/

fun main() {
/*    partitionLettersAndOtherSymbols()
    partitionWordsAndLines()*/
    val arrayList = intArrayOf(1, 2, 5).toCollection(ArrayList())
}
