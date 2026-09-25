package lessons.lesson07.homeworks

// Задача повышенной сложности — AdvancedCycles.kt

// 1. Таблица умножения 10x10, как на картинке
fun printMultiplicationTable() {
    for (i in 1..10) {
        for (j in 1..10) {
            print(i * j)
            if (j < 10) print(" ")
        }
        println()
    }
}

// 2. Сумма чисел от 1 до arg через цикл for
fun sumOneToArg(arg: Int): Int {
    var sum = 0
    for (i in 1..arg) {
        sum += i
    }
    return sum
}

// 3. Факториал числа arg через цикл while
fun factorial(arg: Int): Long {
    var result = 1L
    var i = 1
    while (i <= arg) {
        result *= i
        i++
    }
    return result
}

// 4. Сумма всех чётных чисел от 2 до arg через цикл while
fun sumEvenTwoToArg(arg: Int): Int {
    var sum = 0
    var i = 2
    while (i <= arg) {
        sum += i
        i += 2
    }
    return sum
}

// 5. Прямоугольник 5x3 из символов * через вложенные while
fun printRectangle() {
    var row = 1
    while (row <= 3) {
        var col = 1
        while (col <= 5) {
            print("*")
            col++
        }
        println()
        row++
    }
}

// 6. Суммы чётных и нечётных чисел от 1 до arg через цикл for
fun printEvenOddSums(arg: Int) {
    var evenSum = 0
    var oddSum = 0
    for (i in 1..arg) {
        if (i % 2 == 0) {
            evenSum += i
        } else {
            oddSum += i
        }
    }
    println("Сумма чётных: $evenSum")
    println("Сумма нечётных: $oddSum")
}

// Проверка работы
fun main() {
    println("Таблица умножения:")
    printMultiplicationTable()

    println("\nСумма 1..5 = ${sumOneToArg(5)}")
    println("Факториал 5 = ${factorial(5)}")
    println("Сумма чётных от 2 до 10 = ${sumEvenTwoToArg(10)}")

    println("\nПрямоугольник 5x3:")
    printRectangle()

    println("\nСуммы чётных и нечётных от 1 до 10:")
    printEvenOddSums(10)
}