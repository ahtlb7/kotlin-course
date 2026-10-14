package lessons.lesson12.homeworks

// =====================================================
// Задачи на приведение коллекции к значению
// Каждая задача — свой метод, без повторов
// =====================================================

val numbers = listOf(-1, 2, -3, 4, -5, 8, 264)

// 1. Проверить, что размер коллекции больше 5 элементов → isNotEmpty
fun task1() {
    val result = numbers.size > 5
    println("Размер больше 5: $result")
}

// 2. Проверить, что коллекция пустая → isEmpty
fun task2() {
    val empty = emptyList<Int>()
    println("Коллекция пустая: ${empty.isEmpty()}")
}

// 3. Проверить, что коллекция не пустая → isNotEmpty
fun task3() {
    println("Коллекция не пустая: ${numbers.isNotEmpty()}")
}

// 4. Взять элемент по индексу или значение по умолчанию → getOrElse
fun task4() {
    val element = numbers.getOrElse(100) { -1 }
    println("Элемент или значение по умолчанию: $element")
}

// 5. Собрать коллекцию в строку → joinToString
fun task5() {
    val text = numbers.joinToString(separator = " : ")
    println("Коллекция в строку: $text")
}

// 6. Посчитать сумму всех значений → sum
fun task6() {
    println("Сумма: ${numbers.sum()}")
}

// 7. Посчитать среднее → average
fun task7() {
    println("Среднее: ${numbers.average()}")
}

// 8. Взять максимальное число → maxOrNull
fun task8() {
    println("Максимум: ${numbers.maxOrNull()}")
}

// 9. Взять минимальное число → minOrNull
fun task9() {
    println("Минимум: ${numbers.minOrNull()}")
}

// 10. Взять первое число или null → firstOrNull
fun task10() {
    println("Первое число или null: ${numbers.firstOrNull()}")
}

// 11. Проверить, что коллекция содержит элемент → contains
fun task11() {
    println("Содержит 4: ${numbers.contains(4)}")
}

// =====================================================
// Задачи на обработку коллекций
// =====================================================

// 1. Отфильтровать по диапазону 18–30 → filter
fun process1() {
    val ages = listOf(12, 18, 25, 31, 40, 22, 19, 55)
    println("18..30: ${ages.filter { it in 18..30 }}")
}

// 2. Числа, которые не делятся на 2 и 3 одновременно → filterNot
fun process2() {
    val values = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18)
    println("Не делятся на 2 и 3 одновременно: ${values.filterNot { it % 2 == 0 && it % 3 == 0 }}")
}

// 3. Очистить текстовую коллекцию от null → filterNotNull
fun process3() {
    val list = listOf("Kotlin", null, "Java", null, "Scala")
    println("Без null: ${list.filterNotNull()}")
}

// 4. Преобразовать текстовую коллекцию в длины слов → map
fun process4() {
    val words = listOf("Kotlin", "Java", "Scala", "Go")
    println("Длины слов: ${words.map { it.length }}")
}

// 5. Мапа: перевёрнутые слова → длина → associate
fun process5() {
    val words = listOf("Kotlin", "Java", "Scala")
    val map = words.associate { it.reversed() to it.length }
    println("Мапа (перевёрнутые → длина): $map")
}

// 6. Сортировка по алфавиту → sorted
fun process6() {
    val words = listOf("Kotlin", "Java", "Scala", "Go", "Ada")
    println("По алфавиту: ${words.sorted()}")
}

// 7. Взять первые 3 элемента → take
fun process7() {
    println("Первые 3: ${numbers.take(3)}")
}

// 8. Квадраты элементов → forEach
fun process8() {
    print("Квадраты: ")
    numbers.forEach { print("${it * it} ") }
    println()
}

// 9. Группировка по первой букве → groupBy
fun process9() {
    val words = listOf("Kotlin", "Java", "Scala", "Go", "Ada", "Kotlin")
    println("Группировка: ${words.groupBy { it.first().lowercaseChar() }}")
}

// 10. Очистить от дублей → distinct
fun process10() {
    val list = listOf(1, 2, 2, 3, 3, 3, 4, 4, 5)
    println("Уникальные: ${list.distinct()}")
}

// 11. Сортировка по убыванию → sortedDescending
fun process11() {
    println("По убыванию: ${numbers.sortedDescending()}")
}

// 12. Взять последние 3 элемента → takeLast
fun process12() {
    println("Последние 3: ${numbers.takeLast(3)}")
}

// =====================================================
// Задача 24. Характеристика числовой коллекции
// =====================================================
fun characterizeCollection(collection: List<Int>): String {
    return when {
        collection.isEmpty() -> "Пусто"
        collection.size < 5 -> "Короткая"
        collection.first() == 0 -> "Стартовая"
        collection.sum() > 10000 -> "Массивная"
        collection.average() == 10.0 -> "Сбалансированная"
        collection.joinToString("").length == 20 -> "Клейкая"
        (collection.maxOrNull() ?: 0) < -10 -> "Отрицательная"
        (collection.minOrNull() ?: 0) > 1000 -> "Положительная"
        collection.contains(3) && collection.contains(14) -> "Пи***тая"
        else -> "Уникальная"
    }
}

// =====================================================
// Задача 25. Анализ учебных оценок
// =====================================================
fun analyzeGrades(grades: List<Int>): List<Int> {
    return grades
        .filter { it >= 60 }
        .sorted()
        .take(3)
}

// =====================================================
// Задача 26. Каталог по первой букве
// =====================================================
fun buildCatalog(list: List<String>): Map<Char, List<String>> {
    return list
        .map { it.lowercase() }
        .groupBy { it.first() }
}

// =====================================================
// Задача 27. Средняя длина слов
// =====================================================
fun averageWordLength(list: List<String>): String {
    val average = list
        .map { it.length }
        .average()
    return "Средняя длина слова: %.2f".format(average)
}

// =====================================================
// Задача 28. Категоризация чисел
// =====================================================
fun categorizeNumbers(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy { if (it % 2 == 0) "четные" else "нечетные" }
}

// =====================================================
// Задача 29. Поиск первого подходящего элемента
// =====================================================
fun findFirstAge(ages: List<Int?>, target: Int): Int? {
    return ages.firstOrNull { it != null && it > target }
}

// =====================================================
// Проверка работы
// =====================================================
fun main() {
    println("=== Приведение коллекции к значению ===")
    print("1. "); task1()
    print("2. "); task2()
    print("3. "); task3()
    print("4. "); task4()
    print("5. "); task5()
    print("6. "); task6()
    print("7. "); task7()
    print("8. "); task8()
    print("9. "); task9()
    print("10. "); task10()
    print("11. "); task11()

    println("\n=== Обработка коллекций ===")
    print("1. "); process1()
    print("2. "); process2()
    print("3. "); process3()
    print("4. "); process4()
    print("5. "); process5()
    print("6. "); process6()
    print("7. "); process7()
    print("8. "); process8()
    print("9. "); process9()
    print("10. "); process10()
    print("11. "); process11()
    print("12. "); process12()

    println("\n=== Задача 24 ===")
    println(characterizeCollection(emptyList()))
    println(characterizeCollection(listOf(1, 2, 3)))
    println(characterizeCollection(listOf(0, 1, 2, 3, 4, 5)))
    println(characterizeCollection(listOf(3000, 3000, 3000, 3000, 3000)))
    println(characterizeCollection(listOf(10, 10, 10, 10, 10)))
    println(characterizeCollection(listOf(12, 34, 56, 78, 90, 12, 34, 56, 78, 90)))
    println(characterizeCollection(listOf(-20, -30, -40, -50, -60)))
    println(characterizeCollection(listOf(1001, 1002, 1003, 1004, 1005, 1006)))
    println(characterizeCollection(listOf(3, 14, 1, 2, 5)))
    println(characterizeCollection(listOf(1, 2, 3, 4, 5)))

    println("\n=== Задача 25 ===")
    val grades = listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)
    println("Топ-3 удовлетворительных: ${analyzeGrades(grades)}")

    println("\n=== Задача 26 ===")
    val items = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер",
        "Шкаф", "часы", "Люстра", "подушка", "Картина", "столик",
        "Вазон", "шторы", "Пуф", "книга", "Фоторамка", "светильник",
        "Коврик", "вешалка", "Подставка", "телевизор", "Комод",
        "полка", "Абажур", "диван", "Кресло", "занавеска", "Бра",
        "пепельница", "Глобус", "статуэтка", "Поднос", "фигурка",
        "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
        "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья",
        "посуда", "Настольная лампа", "торшер", "Этажерка"
    )
    val catalog = buildCatalog(items)
    catalog.forEach { (letter, words) ->
        println("$letter: $words")
    }

    println("\n=== Задача 27 ===")
    println(averageWordLength(items))

    println("\n=== Задача 28 ===")
    val nums = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
    println(categorizeNumbers(nums))

    println("\n=== Задача 29 ===")
    val ages = listOf(22, 18, 30, 45, 17, null, 60)
    println("Первый возраст > 18: ${findFirstAge(ages, 18)}")
    println("Первый возраст > 100: ${findFirstAge(ages, 100)}")
}