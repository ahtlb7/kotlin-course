package lessons.lesson16.homeworks.animals

// Добавляем импорты из родительского пакета
import lessons.lesson16.homeworks.Colors
import lessons.lesson16.homeworks.printColored

class Bird : Animal() {
    override fun makeSound() {
        printColored("Bird: Tweet!", Colors.GREEN)
    }
}