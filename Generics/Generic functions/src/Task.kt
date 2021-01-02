import java.util.*
import kotlin.collections.ArrayList

fun <T, C : MutableCollection<in T>> Collection<T>.partitionTo(destination1: C, destination2: C, predicate: (T) -> Boolean): Pair<C, C> {
    val(one, two) = this.partition(predicate)
    return Pair(one.toCollection(destination1), two.toCollection(destination2))
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
}