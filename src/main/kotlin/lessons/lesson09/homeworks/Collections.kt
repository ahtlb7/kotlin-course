package lessons.lesson09.homeworks

// Работа с массивами Array

// 1. Массив из 5 целых чисел, значения от 1 до 5
fun taskArray1() {
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers.joinToString())
}

// 2. Пустой массив строк размером 10 элементов
fun taskArray2() {
    val emptyStrings = Array(10) { "" }
    println("Размер массива: ${emptyStrings.size}")
}

// 3. Массив из 5 Double, значения — удвоенный индекс элемента
fun taskArray3() {
    val doubles = Array(5) { i -> i * 2.0 }
    println(doubles.joinToString())
}

// 4. Массив из 5 Int. Каждый элемент = индекс * 3
fun taskArray4() {
    val ints = Array(5) { 0 }
    for (i in ints.indices) {
        ints[i] = i * 3
    }
    println(ints.joinToString())
}

// 5. Массив из 3 nullable строк: null + две строки
fun taskArray5() {
    val nullableStrings: Array<String?> = arrayOf(null, "Kotlin", "Java")
    println(nullableStrings.joinToString())
}

// 6. Скопировать массив в новый в цикле
fun taskArray6() {
    val source = arrayOf(10, 20, 30, 40, 50)
    val copy = Array(source.size) { 0 }
    for (i in source.indices) {
        copy[i] = source[i]
    }
    println(copy.joinToString())
}

// 7. Третий массив = разность двух исходных
fun taskArray7() {
    val first = arrayOf(10, 20, 30, 40, 50)
    val second = arrayOf(1, 2, 3, 4, 5)
    val diff = Array(first.size) { 0 }
    for (i in first.indices) {
        diff[i] = first[i] - second[i]
    }
    println(diff.joinToString())
}

// 8. Индекс элемента со значением 5 или -1 (через while)
fun taskArray8() {
    val numbers = arrayOf(10, 20, 5, 40, 50)
    var i = 0
    var foundIndex = -1
    while (i < numbers.size) {
        if (numbers[i] == 5) {
            foundIndex = i
            break
        }
        i++
    }
    println(foundIndex)
}

// 9. Перебор массива: чётное / нечётное
fun taskArray9() {
    val numbers = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    for (n in numbers) {
        val label = if (n % 2 == 0) "чётное" else "нечётное"
        println("$n — $label")
    }
}

// 10. Поиск элемента, содержащего подстроку
fun taskArray10(array: Array<String>, query: String) {
    for (item in array) {
        if (item.contains(query)) {
            println(item)
        }
    }
}

// Работа со списками List

// 1. Пустой неизменяемый список Int
fun taskList1() {
    val empty: List<Int> = emptyList()
    println(empty)
}

// 2. Неизменяемый список строк из трёх элементов
fun taskList2() {
    val strings: List<String> = listOf("Hello", "World", "Kotlin")
    println(strings)
}

// 3. Изменяемый список Int со значениями 1..5
fun taskList3() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    println(numbers)
}

// 4. Добавить элементы 6, 7, 8
fun taskList4() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers.add(6)
    numbers.add(7)
    numbers.add(8)
    println(numbers)
}

// 5. Удалить "World"
fun taskList5() {
    val strings = mutableListOf("Hello", "World", "Kotlin")
    strings.remove("World")
    println(strings)
}

// 6. Цикл по списку Int
fun taskList6() {
    val numbers = listOf(10, 20, 30, 40)
    for (n in numbers) {
        println(n)
    }
}

// 7. Получить второй элемент списка строк
fun taskList7() {
    val strings = listOf("Hello", "World", "Kotlin")
    println(strings[1])
}

// 8. Заменить элемент с индексом 2
fun taskList8() {
    val numbers = mutableListOf(1, 2, 3, 4, 5)
    numbers[2] = 99
    println(numbers)
}

// 9. Объединить два списка строк в один (через циклы)
fun taskList9() {
    val list1 = listOf("A", "B", "C")
    val list2 = listOf("D", "E", "F")
    val combined = mutableListOf<String>()
    for (item in list1) combined.add(item)
    for (item in list2) combined.add(item)
    println(combined)
}

// 10. Минимальный и максимальный элементы списка
fun taskList10() {
    val numbers = listOf(42, -5, 17, 88, 3, 0)
    var min = numbers[0]
    var max = numbers[0]
    for (n in numbers) {
        if (n < min) min = n
        if (n > max) max = n
    }
    println("Минимум: $min")
    println("Максимум: $max")
}

// 11. Новый список только с чётными числами
fun taskList11() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val even = mutableListOf<Int>()
    for (n in numbers) {
        if (n % 2 == 0) even.add(n)
    }
    println(even)
}

// Работа с Множествами Set

// 1. Пустое неизменяемое множество Int
fun taskSet1() {
    val empty: Set<Int> = emptySet()
    println(empty)
}

// 2. Неизменяемое множество из трёх элементов
fun taskSet2() {
    val numbers: Set<Int> = setOf(1, 2, 3)
    println(numbers)
}

// 3. Изменяемое множество строк
fun taskSet3() {
    val langs: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")
    println(langs)
}

// 4. Добавить "Swift" и "Go"
fun taskSet4() {
    val langs = mutableSetOf("Kotlin", "Java", "Scala")
    langs.add("Swift")
    langs.add("Go")
    println(langs)
}

// 5. Удалить 2
fun taskSet5() {
    val numbers = mutableSetOf(1, 2, 3, 4, 5)
    numbers.remove(2)
    println(numbers)
}

// 6. Цикл по множеству Int
fun taskSet6() {
    val numbers = setOf(10, 20, 30, 40)
    for (n in numbers) {
        println(n)
    }
}

// 7. Функция проверки наличия строки в множестве (через цикл)
fun taskSet7(set: Set<String>, query: String) {
    var found = false
    for (item in set) {
        if (item == query) {
            found = true
            break
        }
    }
    println(found)
}

// 8. Неизменяемое множество строк → изменяемый список (через цикл)
fun taskSet8() {
    val source: Set<String> = setOf("Kotlin", "Java", "Scala")
    val result: MutableList<String> = mutableListOf()
    for (item in source) {
        result.add(item)
    }
    println(result)
}

// Проверка работы
fun main() {
    println("=== Массивы Array ===")
    println("1:"); taskArray1()
    println("2:"); taskArray2()
    println("3:"); taskArray3()
    println("4:"); taskArray4()
    println("5:"); taskArray5()
    println("6:"); taskArray6()
    println("7:"); taskArray7()
    println("8:"); taskArray8()
    println("9:"); taskArray9()
    println("10:")
    taskArray10(arrayOf("Hello world", "Kotlin is fun", "Java"), "fun")

    println("\n=== Списки List ===")
    println("1:"); taskList1()
    println("2:"); taskList2()
    println("3:"); taskList3()
    println("4:"); taskList4()
    println("5:"); taskList5()
    println("6:"); taskList6()
    println("7:"); taskList7()
    println("8:"); taskList8()
    println("9:"); taskList9()
    println("10:"); taskList10()
    println("11:"); taskList11()

    println("\n=== Множества Set ===")
    println("1:"); taskSet1()
    println("2:"); taskSet2()
    println("3:"); taskSet3()
    println("4:"); taskSet4()
    println("5:"); taskSet5()
    println("6:"); taskSet6()
    println("7:")
    taskSet7(setOf("Kotlin", "Java", "Scala"), "Java")
    println("8:"); taskSet8()
}