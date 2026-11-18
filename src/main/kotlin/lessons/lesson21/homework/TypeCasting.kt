package lessons.lesson21.homework

// =====================================================
// Задача 1. analyzeDataType
// =====================================================
fun analyzeDataType(arg: Any) {
    val result = when (arg) {
        is String -> "Это строка: $arg"
        is Number -> "Это число: $arg"
        is List<*> -> "Это список, количество элементов: ${arg.size}"
        is Map<*, *> -> "Это словарь, количество пар: ${arg.size}"
        else -> "Неизвестный тип данных"
    }
    println(result)
}

// =====================================================
// Задача 2. safeCastToList
// =====================================================
fun safeCastToList(arg: Any): Int {
    return (arg as? List<*>)?.size ?: -1
}

// =====================================================
// Задача 3. getStringLengthOrZero
// =====================================================
fun getStringLengthOrZero(arg: Any?): Int {
    return (arg as? String)?.length ?: 0
}

// =====================================================
// Задача 4. toSquare (расширение для Any)
// =====================================================
fun Any.toSquare(): Double {
    // Если это число, берем toDouble(). Если это строка, приводим к String и вызываем toDouble()
    val number = (this as? Number)?.toDouble() ?: (this as String).toDouble()
    return number * number
}

// =====================================================
// Задача 5. sumIntOrDoubleValues
// =====================================================
fun sumIntOrDoubleValues(list: List<Any>): Double {
    return list.sumOf {
        (it as? Int)?.toDouble() ?: (it as? Double) ?: 0.0
    }
}

// =====================================================
// Задача 6. tryCastToListAndPrint
// =====================================================
fun tryCastToListAndPrint(arg: Any) {
    val list = arg as? List<*>

    if (list == null) {
        println("Ошибка: не удалось преобразовать аргумент в список")
        return
    }

    for (item in list) {
        if (item is String) {
            println("Строка: $item")
        } else {
            println("Предупреждение: элемент '$item' не является строкой")
        }
    }
}


// =====================================================
// Проверка работы (main)
// =====================================================
fun main() {
    println("=== Задача 1 ===")
    analyzeDataType("Привет")
    analyzeDataType(42)
    analyzeDataType(3.14)
    analyzeDataType(listOf(1, 2, 3))
    analyzeDataType(mapOf("a" to 1, "b" to 2))
    analyzeDataType(true)

    println("\n=== Задача 2 ===")
    println(safeCastToList(listOf(10, 20, 30))) // 3
    println(safeCastToList("Я не список"))      // -1

    println("\n=== Задача 3 ===")
    println(getStringLengthOrZero("Kotlin"))    // 6
    println(getStringLengthOrZero(123))         // 0
    println(getStringLengthOrZero(null))        // 0

    println("\n=== Задача 4 ===")
    println(4.toSquare())       // 16.0
    println(4.2.toSquare())     // 17.64
    println("5.0".toSquare())   // 25.0

    println("\n=== Задача 5 ===")
    val mixedList = listOf(1, 2.5, "Строка", 4, true, 10.0)
    println(sumIntOrDoubleValues(mixedList)) // 1.0 + 2.5 + 4.0 + 10.0 = 17.5

    println("\n=== Задача 6 ===")
    println("Тест с правильным списком:")
    tryCastToListAndPrint(listOf("Яблоко", "Банан", 123, "Апельсин"))

    println("\nТест с неправильным типом:")
    tryCastToListAndPrint("Я просто строка, а не список")
}