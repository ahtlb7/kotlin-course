package lessons.lesson19.homeworks

fun <M> getMiddleElement(list: List<M>): M? {
    // Если список пустой или его размер четный - среднего элемента нет
    if (list.isEmpty() || list.size % 2 == 0) {
        return null
    }
    return list[list.size / 2]
}