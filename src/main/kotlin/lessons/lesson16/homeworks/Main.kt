package lessons.lesson16.homeworks

// Импорты из подпапок
import lessons.lesson16.homeworks.animals.*
import lessons.lesson16.homeworks.shapes.*
import lessons.lesson16.homeworks.printers.*
import lessons.lesson16.homeworks.cart.*
import lessons.lesson16.homeworks.logger.*

fun main() {
    println("=== 1. Животные ===")
    // Убрали Animal(), так как это абстрактный класс!
    val animals = listOf(Dog(), Cat(), Bird())
    for (animal in animals) {
        animal.makeSound()
    }

    println("\n=== 2. Геометрические фигуры ===")
    val shapes = listOf(Circle(5.0), Square(4.0), Triangle(3.0, 4.0, 90.0))
    for (shape in shapes) {
        println("Площадь фигуры ${shape::class.simpleName}: ${"%.2f".format(shape.area())}")
    }

    println("\n=== 3. Принтеры ===")
    val laser = LaserPrinter()
    val inkjet = InkjetPrinter()
    val text = "Полиморфизм позволяет объектам вести себя по-разному"

    println("Лазерный принтер:")
    laser.print(text)

    println("\nСтруйный принтер:")
    inkjet.print(text)

    println("\n\n=== 4. Корзина товаров ===")
    val cart = ShoppingCart()
    cart.addToCart("Apple")
    cart.addToCart("Banana", 3)
    cart.addToCart(mapOf("Orange" to 2, "Apple" to 1))
    cart.addToCart(listOf("Milk", "Bread", "Milk"))
    println(cart.toString())

    println("\n=== 5. Логгер ===")
    val logger = Logger()
    logger.log("Приложение запущено")
    logger.log(LogLevel.WARNING, "Мало места на диске")
    logger.log(LogLevel.ERROR, "Критический сбой базы данных")
    logger.log(LogLevel.DEBUG, "Переменная x = 10")

    println("\nСписок логов:")
    logger.log(listOf("Шаг 1", "Шаг 2", "Шаг 3"))

    println("\nОшибка через Exception:")
    logger.log(Exception("File not found"))
}