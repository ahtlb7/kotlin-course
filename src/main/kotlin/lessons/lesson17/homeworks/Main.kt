package lessons.lesson17.homeworks

fun main() {
    val child = ChildrenClass("Значение1", "Значение2", "Значение3")
    
    // 3. Меняем publicField
    child.publicField = "Антонио Бандерас"
    
    // 5. Меняем protectedField
    child.updateProtectedField("Новое значение ProtectedField")
    
    // 8. Выводим результат
    println(child.getAll())
    
    // 12. Проверяем printText
    println("\nВызов printText():")
    child.printText()
}