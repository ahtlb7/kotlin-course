package lessons.lesson06.homeworks

// Задание 1. Определение сезона
fun printSeason(month: Int) {
    when (month) {
        in 1..2, 12 -> println("Зима")
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        else -> println("Некорректный номер месяца: $month")
    }
}


// Задание 2. Расчёт возраста питомца
fun printDogAgeInHumanYears(dogAge: Double) {
    if (dogAge < 0) {
        println("Возраст собаки не может быть отрицательным")
        return
    }

    val humanYears = if (dogAge <= 2) {
        dogAge * 10.5
    } else {
        2 * 10.5 + (dogAge - 2) * 4
    }

    println("Возраст собаки в человеческих годах: $humanYears")
}

// Задание 3. Определение способа перемещения
fun printTransport(distanceKm: Double) {
    if (distanceKm < 0) {
        println("Длина маршрута не может быть отрицательной")
        return
    }

    when {
        distanceKm <= 1.0 -> println("пешком")
        distanceKm <= 5.0 -> println("велосипед")
        else -> println("автотранспорт")
    }
}

// Задание 4. Расчёт бонусных баллов
fun printBonusPoints(amount: Int) {
    if (amount < 0) {
        println("Сумма покупки не может быть отрицательной")
        return
    }

    val points = if (amount <= 1000) {
        (amount / 100) * 2
    } else {
        (amount / 100) * 3
    }

    println("Бонусные баллы: $points")
}

// Задание 5. Определение типа документа
fun printDocumentType(extension: String) {
    when (extension.lowercase()) {
        "txt", "doc", "docx", "pdf", "rtf", "odt" -> println("Текстовый документ")
        "jpg", "jpeg", "png", "gif", "bmp", "svg", "webp" -> println("Изображение")
        "xls", "xlsx", "csv", "ods" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

// Задание 6. Конвертация температуры
fun printTemperatureConversion(value: Double, unit: Char) {
    when (unit.uppercaseChar()) {
        'C' -> {
            val fahrenheit = value * 9 / 5 + 32
            print("$fahrenheit")
            print("F")
            println()
        }
        'F' -> {
            val celsius = (value - 32) * 5 / 9
            print("$celsius")
            print("C")
            println()
        }
        else -> println("Неизвестная единица измерения: $unit")
    }
}

// Задание 7. Подбор одежды по погоде
fun printClothingRecommendation(temperature: Int) {
    when {
        temperature < -30 || temperature > 35 -> println("Не выходить из дома")
        temperature < 10 -> println("куртка и шапка")
        temperature <= 18 -> println("ветровка")
        else -> println("футболка и шорты")
    }
}

// Задание 8. Выбор фильма по возрасту
fun printFilmCategories(age: Int) {
    if (age < 0) {
        println("Возраст не может быть отрицательным")
        return
    }

    val categories = when (age) {
        in 0..9 -> "детские"
        in 10..18 -> "подростковые"
        else -> "18+"
    }

    println(categories)
}

// Проверка работы функций
fun main() {
    // Задание 1
    printSeason(1)   // Зима
    printSeason(4)   // Весна
    printSeason(7)   // Лето
    printSeason(10)  // Осень
    printSeason(13)  // Некорректный номер месяца

    // Задание 2
    printDogAgeInHumanYears(1.0)   // 10.5
    printDogAgeInHumanYears(2.0)   // 21.0
    printDogAgeInHumanYears(5.0)   // 33.0
    printDogAgeInHumanYears(-1.0)  // ошибка

    // Задание 3
    printTransport(0.5)  // пешком
    printTransport(3.0)  // велосипед
    printTransport(10.0) // автотранспорт
    printTransport(-1.0) // ошибка

    // Задание 4
    printBonusPoints(500)   // 10
    printBonusPoints(1000)  // 20
    printBonusPoints(1500)  // 45
    printBonusPoints(-100)  // ошибка

    // Задание 5
    printDocumentType("pdf")   // Текстовый документ
    printDocumentType("PNG")   // Изображение
    printDocumentType("xlsx")  // Таблица
    printDocumentType("mp3")   // Неизвестный тип

    // Задание 6
    printTemperatureConversion(25.0, 'C')  // 77.0F
    printTemperatureConversion(77.0, 'F')  // 25.0C
    printTemperatureConversion(10.0, 'X')  // ошибка

    // Задание 7
    printClothingRecommendation(-35)  // Не выходить из дома
    printClothingRecommendation(5)    // куртка и шапка
    printClothingRecommendation(15)   // ветровка
    printClothingRecommendation(25)   // футболка и шорты
    printClothingRecommendation(40)   // Не выходить из дома

    // Задание 8
    printFilmCategories(5)    // детские
    printFilmCategories(15)   // подростковые
    printFilmCategories(30)   // 18+
    printFilmCategories(-1)   // ошибка
}