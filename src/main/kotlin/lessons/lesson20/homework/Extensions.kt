package lessons.lesson20.homeworks

import kotlin.math.absoluteValue

// =====================================================
// Задание 1. Расширение для массива чисел
// =====================================================
fun Array<Int>.getAround(): Pair<Int?, Int?> {
    return if (this.isEmpty()) {
        null to null
    } else {
        this.first() to this.last()
    }
}

// =====================================================
// Задание 2. Расширение для изменяемого списка
// =====================================================
fun <T : Comparable<T>> MutableList<T>.sortList(ascending: Boolean): List<T> {
    // Сортируем исходный список (так как он Mutable)
    if (ascending) {
        this.sort()
    } else {
        this.sortDescending()
    }
    // Возвращаем неизменяемую копию (toList)
    return this.toList()
}

// =====================================================
// Задание 3. Расширение для nullable словаря
// (Используем 2 дженерика, чтобы ключ и значения были разных типов)
// =====================================================
fun <K, V> Map<K, List<V>>?.mapByIndex(index: Int): Map<String, V?>? {
    return this?.mapKeys { it.key.toString() }
        ?.mapValues { it.value.getOrNull(index) }
}

// =====================================================
// Задание 4. Расширение within для Number
// =====================================================
fun Number.within(other: Number, deviation: Number): Boolean {
    val diff = this.toDouble() - other.toDouble()
    return diff.absoluteValue <= deviation.toDouble()
}

// =====================================================
// Задание 5. Шифрование и дешифрование строки (Unicode)
// =====================================================
fun String.encrypt(base: Int): String {
    return this.map { (it + base) }.joinToString("")
}

fun String.decrypt(base: Int): String {
    return this.map { (it - base) }.joinToString("")
}

// =====================================================
// Задание 6. Твиттеризация (побуквенный вывод)
// =====================================================
fun String.twitterize(authors: List<String>) {
    if (authors.isEmpty()) return
    var index = 0
    for (char in this) {
        println(authors[index])
        println(char.uppercase())
        println()
        index = (index + 1) % authors.size
    }
}


// =====================================================
// Проверка работы
// =====================================================
fun main() {
    println("=== Задание 1: getAround ===")
    val array1 = arrayOf(1, 2, 3, 4, 5)
    val array2 = emptyArray<Int>()
    println("Массив [1, 2, 3, 4, 5]: ${array1.getAround()}") // (1, 5)
    println("Пустой массив: ${array2.getAround()}")        // (null, null)

    println("\n=== Задание 2: sortList ===")
    val mutableList = mutableListOf(5, 2, 8, 1, 9)
    println("Исходный список: $mutableList")
    val sortedAsc = mutableList.sortList(true)
    println("Сортировка по возрастанию: $sortedAsc")
    println("Исходный список после сортировки: $mutableList") // Список изменился

    val anotherList = mutableListOf("Banana", "Apple", "Cherry")
    val sortedDesc = anotherList.sortList(false)
    println("Строки по убыванию: $sortedDesc")

    println("\n=== Задание 3: mapByIndex ===")
    // Теперь это работает, так как функция принимает <K, V>
    val map: Map<Int, List<String>> = mapOf(
        1 to listOf("A", "B", "C"),
        2 to listOf("D", "E")
    )
    val nullableMap: Map<Int, List<String>>? = null

    println("Индекс 1 (map): ${map.mapByIndex(1)}") // {1=B, 2=E}
    println("Индекс 5 (map): ${map.mapByIndex(5)}") // {1=null, 2=null}
    println("Null-словарь: ${nullableMap.mapByIndex(1)}") // null

    println("\n=== Задание 4: within ===")
    println("5.0 в пределах 0.5 от 5.3: ${5.0.within(5.3, 0.5)}")   // true
    println("5.0 в пределах 0.1 от 5.3: ${5.0.within(5.3, 0.1)}")   // false
    println("10 в пределах 2 от 12: ${10.within(12, 2)}")          // true

    println("\n=== Задание 5: encrypt / decrypt ===")
    val original = "Kotlin"
    val shift = 3
    val encrypted = original.encrypt(shift)
    val decrypted = encrypted.decrypt(shift)
    println("Оригинал: $original")
    println("Зашифровано (сдвиг $shift): $encrypted")
    println("Расшифровано: $decrypted")
    println("Успешно: ${original == decrypted}")

    println("\n=== Задание 6: twitterize ===")
    val phrase = "Hello"
    val authors = listOf("@user1", "@user2", "@user3")
    phrase.twitterize(authors)
}