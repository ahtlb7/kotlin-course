package lessons.lesson08.homeworks

// 7. Все слова с большой буквы
fun capitalizeWords(input: String) {
    val words = input.split(" ")
    val result = StringBuilder()

    for ((index, word) in words.withIndex()) {
        if (word.isEmpty()) continue
        val first = word[0].uppercaseChar()
        val rest = word.substring(1).lowercase()
        result.append(first).append(rest)
        if (index < words.size - 1) result.append(" ")
    }

    println(result.toString())
}

// 8. Игра в разведчика
fun encrypt(input: String) {
    val prepared = if (input.length % 2 != 0) input + " " else input
    val sb = StringBuilder()
    var i = 0
    while (i < prepared.length) {
        sb.append(prepared[i + 1])
        sb.append(prepared[i])
        i += 2
    }
    println(sb.toString())
}

fun decrypt(input: String) {
    val prepared = if (input.length % 2 != 0) input + " " else input
    val sb = StringBuilder()
    var i = 0
    while (i < prepared.length) {
        sb.append(prepared[i + 1])
        sb.append(prepared[i])
        i += 2
    }
    println(sb.toString().trimEnd())
}

// 9. Таблица умножения с правым выравниванием
fun printMultiplicationTableWithHeaders(rows: Int, columns: Int) {
    // Максимальное значение в таблице — задаёт ширину столбцов
    val maxValue = rows * columns

    // Ширина столбца = длина самого большого числа + 1 пробел-разделитель
    val width = maxValue.toString().length + 1

    // ---------- Заголовок столбцов ----------
    // Пустой отступ слева на ширину столбца с номерами строк
    print(" ".repeat(width))
    for (j in 1..columns) {
        print(j.toString().padStart(width))
    }
    println()

    // ---------- Тело таблицы ----------
    for (i in 1..rows) {
        // Номер строки — выравнивание по правому краю
        print(i.toString().padStart(width - 1))
        print(" ")

        // Результаты умножения
        for (j in 1..columns) {
            val product = i * j
            print(product.toString().padStart(width))
        }
        println()
    }
}

// Проверка работы
fun main() {
    println("=== Задание 7. Слова с большой буквы ===")
    capitalizeWords("котлин лучший язык программирования")

    println("\n=== Задание 8. Шифратор/дешифратор ===")
    val secret = "Kotlin"
    println("Исходное: $secret")
    print("Шифр: ")
    encrypt(secret)
    print("Дешифр: ")
    decrypt("oKltni")

    println("\n=== Задание 9. Таблица умножения с заголовками ===")
    printMultiplicationTableWithHeaders(40, 30)
}