package lessons.lesson07.homeworks

// Задания для цикла for

// Прямой диапазон
// 1. Вывести числа от 1 до 5
fun printOneToFive() {
    for (i in 1..5) {
        println(i)
    }
}

// 2. Вывести чётные числа от 1 до 10
fun printEvenOneToTen() {
    for (i in 1..10) {
        if (i % 2 == 0) println(i)
    }
}

// Обратный диапазон
// 3. Вывести числа от 5 до 1
fun printFiveToOne() {
    for (i in 5 downTo 1) {
        println(i)
    }
}

// 4. Вывести числа от 10 до 1, уменьшая их на 2
fun printTenToOneStepTwo() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

// С шагом (step)
// 5. С шагом 2 для вывода чисел от 1 до 9
fun printOneToNineStepTwo() {
    for (i in 1..9 step 2) {
        println(i)
    }
}

// 6. Каждое третье число в диапазоне от 1 до 20
fun printEveryThirdOneToTwenty() {
    for (i in 1..20 step 3) {
        println(i)
    }
}

// Использование until
// 7. Переменная size, шаг 2, от 3 до size (не включая size)
fun printThreeToSizeStepTwo(size: Int) {
    for (i in 3 until size step 2) {
        println(i)
    }
}

// Задания для цикла while

// Цикл while
// 8. Квадраты чисел от 1 до 5
fun printSquaresOneToFive() {
    var i = 1
    while (i <= 5) {
        println(i * i)
        i++
    }
}

// 9. Уменьшение числа от 10 до 5
fun printTenToFiveWhile() {
    var number = 10
    while (number >= 5) {
        println(number)
        number--
    }
}

// Цикл do while
// 10. do while — вывод чисел от 5 до 1
fun printFiveToOneDoWhile() {
    var i = 5
    do {
        println(i)
        i--
    } while (i >= 1)
}

// 11. do while — пока счётчик меньше 10, начиная с 5
fun printCounterFiveToNineDoWhile() {
    var counter = 5
    do {
        println(counter)
        counter++
    } while (counter < 10)
}

// Задания для прерывания и пропуска итерации

// Использование break
// 12. break при достижении 6
fun printUntilSix() {
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
}

// 13. Бесконечный while, прерывается при 10
fun printUntilTenBreak() {
    var i = 1
    while (true) {
        if (i == 10) break
        println(i)
        i++
    }
}

// Использование continue
// 14. continue — пропустить чётные числа от 1 до 10
fun printOddOneToTen() {
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
}

// 15. while — пропускать числа, кратные 3
fun printSkipMultiplesOfThree() {
    var i = 1
    while (i <= 10) {
        if (i % 3 == 0) {
            i++
            continue
        }
        println(i)
        i++
    }
}

// Проверка работы
fun main() {
    println("1. Числа от 1 до 5:")
    printOneToFive()

    println("\n2. Чётные от 1 до 10:")
    printEvenOneToTen()

    println("\n3. Числа от 5 до 1:")
    printFiveToOne()

    println("\n4. Числа от 10 до 1 с шагом 2:")
    printTenToOneStepTwo()

    println("\n5. Числа от 1 до 9 с шагом 2:")
    printOneToNineStepTwo()

    println("\n6. Каждое третье число от 1 до 20:")
    printEveryThirdOneToTwenty()

    println("\n7. От 3 до 10 с шагом 2 (не включая 10):")
    printThreeToSizeStepTwo(10)

    println("\n8. Квадраты чисел от 1 до 5:")
    printSquaresOneToFive()

    println("\n9. Уменьшение от 10 до 5:")
    printTenToFiveWhile()

    println("\n10. do while от 5 до 1:")
    printFiveToOneDoWhile()

    println("\n11. do while от 5 до 9:")
    printCounterFiveToNineDoWhile()

    println("\n12. break при 6:")
    printUntilSix()

    println("\n13. Бесконечный while до 10:")
    printUntilTenBreak()

    println("\n14. Пропуск чётных от 1 до 10:")
    printOddOneToTen()

    println("\n15. Пропуск кратных 3:")
    printSkipMultiplesOfThree()
}