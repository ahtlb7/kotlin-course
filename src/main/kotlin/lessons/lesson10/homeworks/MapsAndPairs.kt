package lessons.lesson10.homeworks

// Задачи на работу со словарём

// 1. Пустой неизменяемый словарь (Int -> Int)
fun task1(): Map<Int, Int> {
    val emptyMap: Map<Int, Int> = mapOf()
    println("Пустой словарь: $emptyMap")
    return emptyMap
}

// 2. Словарь: ключи Float, значения Double
fun task2() {
    val floatsToDoubles: Map<Float, Double> = mapOf(
        1.5f to 2.5,
        3.25f to 4.75,
        0.1f to 9.99,
    )
    println("Словарь Float -> Double: $floatsToDoubles")
}

// 3. Изменяемый словарь: ключи Int, значения String
fun task3(): MutableMap<Int, String> {
    val map: MutableMap<Int, String> = mutableMapOf(
        1 to "один",
        2 to "два",
        3 to "три",
    )
    println("Изменяемый словарь: $map")
    return map
}

// 4. Добавить новые пары в изменяемый словарь
fun task4(map: MutableMap<Int, String>) {
    map[4] = "четыре"
    map[5] = "пять"
    println("После добавления: $map")
}

// 5. Извлечь значение по ключу (существующему и нет)
fun task5(map: Map<Int, String>) {
    val existing = map[1]
    val missing = map[99]
    println("map[1] = $existing")
    println("map[99] = $missing") // null
}

// 6. Удалить элемент по ключу
fun task6(map: MutableMap<Int, String>) {
    map.remove(2)
    println("После удаления ключа 2: $map")
}

// 7. Словарь Double -> Int, деление ключа на значение
fun task7() {
    val map: Map<Double, Int> = mapOf(
        10.0 to 2,
        15.0 to 3,
        7.5 to 0,
        9.0 to 4,
    )
    for ((key, value) in map) {
        if (value == 0) {
            println("$key / $value = бесконечность")
        } else {
            println("$key / $value = ${key / value}")
        }
    }
}

// 8. Изменить значение для существующего ключа
fun task8(map: MutableMap<Int, String>) {
    map[1] = "ОДИН"
    println("После изменения ключа 1: $map")
}

// 9. Объединить два словаря в третий через циклы
fun task9() {
    val map1 = mapOf(1 to "a", 2 to "b", 3 to "c")
    val map2 = mapOf(3 to "C", 4 to "d", 5 to "e")

    val merged: MutableMap<Int, String> = mutableMapOf()

    for ((k, v) in map1) merged[k] = v
    for ((k, v) in map2) merged[k] = v // ключ 3 перезапишется

    println("Объединённый словарь: $merged")
}

// 10. Словарь String -> List<Int>
fun task10() {
    val map: MutableMap<String, MutableList<Int>> = mutableMapOf(
        "чётные" to mutableListOf(2, 4),
        "нечётные" to mutableListOf(1, 3),
    )
    map["чётные"]?.add(6)
    map["нечётные"]?.add(5)
    map["новые"] = mutableListOf(10, 20)

    println("Словарь String -> List<Int>: $map")
}

// 11. Словарь Int -> MutableSet<String>, добавление в множество
fun task11() {
    val map: MutableMap<Int, MutableSet<String>> = mutableMapOf(
        1 to mutableSetOf("Kotlin", "Java"),
        2 to mutableSetOf("Python", "Go"),
    )

    val setForKey1 = map[1]
    setForKey1?.add("Scala")

    println("Словарь Int -> Set: $map")
}

// 12. Словарь с ключами Pair<Int, Int>, найти пару с 5
fun task12() {
    val map: Map<Pair<Int, Int>, String> = mapOf(
        (1 to 2) to "первая",
        (3 to 4) to "вторая",
        (5 to 6) to "третья",
        (7 to 5) to "четвёртая",
        (8 to 9) to "пятая",
    )

    for ((pair, value) in map) {
        if (pair.first == 5 || pair.second == 5) {
            println("Найдено: $pair -> $value")
        }
    }
}

// Задачи на подбор оптимального типа для словаря

// 1. Библиотека: автор -> список книг
// Неизменяемый словарь: список авторов и их книг фиксирован.
// Ключ: String (автор), значение: List<String> (книги).
val library: Map<String, List<String>> = mapOf(
    "Толстой" to listOf("Война и мир", "Анна Каренина"),
    "Достоевский" to listOf("Преступление и наказание", "Идиот"),
    "Булгаков" to listOf("Мастер и Маргарита", "Собачье сердце"),
)

// 2. Справочник растений: тип -> список названий
// Неизменяемый: справочник не редактируется в процессе.
// Ключ: String (тип), значение: List<String> (растения).
val plants: Map<String, List<String>> = mapOf(
    "Цветы" to listOf("Роза", "Тюльпан", "Ромашка"),
    "Деревья" to listOf("Дуб", "Берёза", "Клён"),
    "Кустарники" to listOf("Сирень", "Жасмин"),
)

// 3. Четвертьфинала: команда -> список игроков
// Изменяемый: состав команд может уточняться.
// Ключ: String (команда), значение: MutableList<String> (игроки).
val teams: MutableMap<String, MutableList<String>> = mutableMapOf(
    "Спартак" to mutableListOf("Иванов", "Петров", "Сидоров"),
    "Динамо" to mutableListOf("Кузнецов", "Смирнов"),
)

// 4. Курс лечения: дата -> список препаратов
// Изменяемый: препараты могут добавляться или убираться.
// Ключ: String (дата), значение: MutableList<String> (препараты).
val treatment: MutableMap<String, MutableList<String>> = mutableMapOf(
    "2025-10-01" to mutableListOf("Аспирин", "Витамин C"),
    "2025-10-02" to mutableListOf("Ибупрофен"),
)

// 5. Словарь путешественника: страна -> (город -> список мест)
// Неизменяемый: путеводитель зафиксирован.
// Ключ: String (страна), значение: Map<String, List<String>>.
val travelGuide: Map<String, Map<String, List<String>>> = mapOf(
    "Франция" to mapOf(
        "Париж" to listOf("Эйфелева башня", "Лувр", "Нотр-Дам"),
        "Лион" to listOf("Старый город", "Базилика Фурвьер"),
    ),
    "Италия" to mapOf(
        "Рим" to listOf("Колизей", "Фонтан Треви"),
        "Венеция" to listOf("Площадь Сан-Марко", "Гранд-канал"),
    ),
)

// Проверка работы
fun main() {
    println("=== Задача 1 ==="); task1()
    println("\n=== Задача 2 ==="); task2()

    println("\n=== Задача 3 ===")
    val map3 = task3()

    println("\n=== Задача 4 ==="); task4(map3)
    println("\n=== Задача 5 ==="); task5(map3)
    println("\n=== Задача 6 ==="); task6(map3)
    println("\n=== Задача 7 ==="); task7()
    println("\n=== Задача 8 ==="); task8(map3)
    println("\n=== Задача 9 ==="); task9()
    println("\n=== Задача 10 ==="); task10()
    println("\n=== Задача 11 ==="); task11()
    println("\n=== Задача 12 ==="); task12()

    println("\n=== Подбор типов ===")
    println("Библиотека: $library")
    println("Растения: $plants")
    println("Команды: $teams")
    println("Лечение: $treatment")
    println("Путеводитель: $travelGuide")
}