package lessons.lesson08.homeworks

// 1. Преобразование строк
fun transformPhrase(phrase: String) {
    val result = when {
        phrase.contains("невозможно") -> {
            phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
        }
        phrase.startsWith("Я не уверен") -> {
            phrase + ", но моя интуиция говорит об обратном"
        }
        phrase.contains("катастрофа") -> {
            phrase.replace("катастрофа", "интересное событие")
        }
        phrase.endsWith("без проблем") -> {
            phrase.replace("без проблем", "с парой интересных вызовов на пути")
        }
        phrase.trim().split(" ").size == 1 && phrase.isNotBlank() -> {
            "Иногда, ${phrase.trim()}, но не всегда"
        }
        else -> phrase
    }
    println(result)
}

// 2. Извлечение даты из строки лога
fun extractDateAndTime(log: String) {
    // Формат: "Пользователь вошел в систему -> 2021-12-01 09:48:23"
    val arrowIndex = log.indexOf("->")
    if (arrowIndex == -1) {
        println("Неверный формат лога")
        return
    }

    val rightPart = log.substring(arrowIndex + 2).trim() // "2021-12-01 09:48:23"
    val parts = rightPart.split(" ")
    if (parts.size < 2) {
        println("Неверный формат лога")
        return
    }

    val date = parts[0]
    val time = parts[1]
    println("Дата: $date")
    println("Время: $time")
}

// 3. Маскирование личных данных
fun maskCreditCard(card: String) {
    // Оставляем последние 4 символа, остальные цифры заменяем на *
    val visible = card.takeLast(4)
    val masked = card.dropLast(4).map { ch ->
        if (ch.isDigit()) '*' else ch
    }.joinToString("")
    println(masked + visible)
}

// 4. Форматирование адреса электронной почты
fun formatEmail(email: String) {
    val result = email
        .replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(result)
}

// 5. Извлечение имени файла из пути
fun extractFileName(path: String) {
    // Работает и с "/", и с "\\"
    val normalized = path.replace("\\", "/")
    val slashIndex = normalized.lastIndexOf("/")
    val fileName = if (slashIndex == -1) normalized else normalized.substring(slashIndex + 1)
    println(fileName)
}

// 6. Создание аббревиатуры из фразы
fun createAbbreviation(phrase: String) {
    val words = phrase.split(" ")
    var abbreviation = ""
    for (word in words) {
        if (word.isNotBlank()) {
            abbreviation += word.first().uppercaseChar()
        }
    }
    println(abbreviation)
}

// Проверка работы
fun main() {
    println("=== Задание 1. Преобразование строк ===")
    transformPhrase("Это невозможно выполнить за один день")
    transformPhrase("Я не уверен в успехе этого проекта")
    transformPhrase("Произошла катастрофа на сервере")
    transformPhrase("Этот код работает без проблем")
    transformPhrase("Удача")
    transformPhrase("Сегодня прекрасный день")

    println("\n=== Задание 2. Извлечение даты из лога ===")
    extractDateAndTime("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    println("\n=== Задание 3. Маскирование карты ===")
    maskCreditCard("4539 1488 0343 6467")

    println("\n=== Задание 4. Формат e-mail ===")
    formatEmail("username@example.com")

    println("\n=== Задание 5. Имя файла из пути ===")
    extractFileName("C:/Пользователи/Документы/report.txt")
    extractFileName("D:/good.themes/dracula.theme")

    println("\n=== Задание 6. Аббревиатура ===")
    createAbbreviation("Котлин лучший язык программирования")
}