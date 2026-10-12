package lessons.lesson11.homeworks

// Задачи на сигнатуру метода

// 1. Не принимает аргументов и не возвращает значения
fun doSomething() {
    println("doSomething() выполнена")
}

// 2. Принимает два целых числа и возвращает их сумму
fun sum(a: Int, b: Int): Int {
    return a + b
}

// 3. Принимает строку и ничего не возвращает
fun printString(value: String) {
    println(value)
}

// 4. Принимает список целых чисел и возвращает среднее значение типа Double
fun average(numbers: List<Int>): Double {
    if (numbers.isEmpty()) return 0.0
    var sum = 0
    for (n in numbers) sum += n
    return sum.toDouble() / numbers.size
}

// 5. Принимает nullable строку и возвращает её длину
//    в виде nullable целого числа; доступна только в текущем файле
private fun nullableStringLength(value: String?): Int? {
    return value?.length
}

// 6. Не принимает аргументов и возвращает nullable вещественное число
fun getNullableDouble(): Double? {
    return null
}

// 7. Принимает nullable список целых чисел, не возвращает значения;
//    доступна только в текущем файле
private fun processNullableList(list: List<Int>?) {
    if (list == null) {
        println("Список равен null")
        return
    }
    println("Размер списка: ${list.size}")
}

// 8. Принимает целое число и возвращает nullable строку
fun intToNullableString(value: Int): String? {
    return if (value < 0) null else value.toString()
}

// 9. Не принимает аргументов и возвращает список nullable строк
fun getNullableStringList(): List<String?> {
    return listOf("Kotlin", null, "Java", null, "Scala")
}

// 10. Принимает nullable строку и nullable целое число
//     и возвращает nullable булево значение
fun checkNullable(text: String?, number: Int?): Boolean? {
    if (text == null || number == null) return null
    return text.length == number
}

// Задачи на написание кода

// 1. multiplyByTwo — умножает число на 2
fun multiplyByTwo(number: Int): Int {
    return number * 2
}

// 2. isEven — проверяет чётность числа
fun isEven(number: Int): Boolean {
    return number % 2 == 0
}

// 3. printNumbersUntil — печатает числа от 1 до n;
//    если n < 1 — завершается без вывода
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

// 4. findFirstNegative — первое отрицательное число или null
fun findFirstNegative(numbers: List<Int>): Int? {
    for (n in numbers) {
        if (n < 0) return n
    }
    return null
}

// 5. processList — печатает строки, при null завершает работу
fun processList(list: List<String?>) {
    for (item in list) {
        if (item == null) return
        println(item)
    }
}

// Проверка работы
fun main() {
    println("=== Сигнатуры ===")
    doSomething()
    println("sum(3, 4) = ${sum(3, 4)}")
    printString("Проверка printString")
    println("average(listOf(1,2,3,4)) = ${average(listOf(1, 2, 3, 4))}")
    println("nullableStringLength(\"Kotlin\") = ${nullableStringLength("Kotlin")}")
    println("nullableStringLength(null) = ${nullableStringLength(null)}")
    println("getNullableDouble() = ${getNullableDouble()}")
    processNullableList(null)
    processNullableList(listOf(1, 2, 3))
    println("intToNullableString(42) = ${intToNullableString(42)}")
    println("intToNullableString(-1) = ${intToNullableString(-1)}")
    println("getNullableStringList() = ${getNullableStringList()}")
    println("checkNullable(\"Kotlin\", 6) = ${checkNullable("Kotlin", 6)}")
    println("checkNullable(null, 6) = ${checkNullable(null, 6)}")

    println("\n=== Задачи на написание кода ===")
    println("multiplyByTwo(7) = ${multiplyByTwo(7)}")
    println("isEven(4) = ${isEven(4)}")
    println("isEven(5) = ${isEven(5)}")

    println("printNumbersUntil(5):")
    printNumbersUntil(5)

    println("printNumbersUntil(0): (ничего не должно вывестись)")
    printNumbersUntil(0)

    println("findFirstNegative(listOf(1, 2, -3, 4)) = ${findFirstNegative(listOf(1, 2, -3, 4))}")
    println("findFirstNegative(listOf(1, 2, 3)) = ${findFirstNegative(listOf(1, 2, 3))}")

    println("processList(listOf(\"a\", \"b\", null, \"c\")):")
    processList(listOf("a", "b", null, "c"))
}