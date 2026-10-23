package lessons.lesson14.homeworks

fun main() {
    println("--- Задание 1: Вечеринка ---")
    val party = Party("Лофт на Красном Октябре", 50)
    party.details()

    println("\n--- Задание 2: Эмоция ---")
    val emotion = Emotion("Радость", 9)
    emotion.express()

    println("\n--- Задание 3: Луна ---")
    Moon.showPhase()

    println("\n--- Задание 4: Продукт ---")
    val product = Product("Ноутбук", 75000.0, 10)
    println(product)

    println("\n--- Задание 5: Концерт ---")
    val concert = Concert("Linkin Park", "Олимпийский", 5000, 2)
    concert.printDetails()
    concert.buyTicket()
    concert.buyTicket()
    concert.buyTicket() // Проверка, когда мест больше нет
    concert.printDetails()

    println("\n--- Задание 6: Стеллаж ---")
    val rack = Rack(maxShelves = 3)

    // Создаем полки (вместимость - это суммарное количество символов)
    val shelf1 = Shelf(10)
    val shelf2 = Shelf(15)

    rack.addShelf(shelf1)
    rack.addShelf(shelf2)

    // Добавляем предметы
    rack.addItem("Книга")     // длина 5 (на 1 полку)
    rack.addItem("Ручка")     // длина 5 (на 1 полку, итого 10)
    rack.addItem("Тетрадь")   // длина 7 (на 2 полку)
    rack.addItem("Пенал")     // длина 5 (на 2 полку, итого 12)

    rack.printContents()

    // Сложное удаление полки 0 (предметы должны переехать на полку 1)
    println("Удаляем полку 0 (предметы перераспределяются)...")
    val lostItems = rack.advancedRemoveShelf(0)
    println("Не удалось перераспределить: $lostItems")

    rack.printContents()
}