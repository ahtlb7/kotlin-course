package lessons.lesson15.homeworks

import lessons.lesson15.homeworks.geometry.*

import lessons.lesson15.homeworks.materials.*

fun main() {
    println("=== 1. Геометрические фигуры ===")
    val triangle = Triangle("Равносторонний треугольник", isEquilateral = true)
    val circle = Circle("Окружность", radius = 5.0)
    println("Фигура: ${triangle.name}, Сторон: ${triangle.sidesCount}")
    println("Фигура: ${circle.name}, Радиус: ${circle.radius}")

    println("\n=== 4. Контейнер Materials ===")

    println("--- InsertFirstMaterial ---")
    val firstContainer = InsertFirstMaterial()
    firstContainer.addMaterial("B")
    firstContainer.addMaterial("C")
    firstContainer.insert("A")
    firstContainer.printContainer()
    // Ожидается: [0]: A, [1]: B, [2]: C

    println("\n--- InsertOneByOneMaterials ---")
    val oneByOne = InsertOneByOneMaterials()
    oneByOne.addMaterial("Old1")
    oneByOne.addMaterial("Old2")
    oneByOne.insert(listOf("New1", "New2", "New3"))
    oneByOne.printContainer()
    // Ожидается: [0]: New1, [1]: Old1, [2]: New2, [3]: Old2, [4]: New3

    println("\n--- InsertSortedMaterials ---")
    val sorted = InsertSortedMaterials()
    sorted.addMaterial("Banana")
    sorted.addMaterial("Apple")
    sorted.insert("Cherry")
    sorted.printContainer()
    // Ожидается: [0]: Apple, [1]: Banana, [2]: Cherry

    println("\n--- InsertMapMaterials ---")
    val mapped = InsertMapMaterials()
    mapped.addMaterial("Middle1")
    mapped.insert(mapOf("Key1" to "Val1", "Key2" to "Val2"))
    mapped.printContainer()
    // Ожидается: [0]: Key2, [1]: Key1, [2]: Middle1, [3]: Val1, [4]: Val2
}