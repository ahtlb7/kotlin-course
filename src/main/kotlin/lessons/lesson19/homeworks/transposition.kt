package lessons.lesson19.homeworks

fun <I, D> transposition(map: Map<I, D>): Map<D, I> {
    return map.entries.associate { it.value to it.key }
}