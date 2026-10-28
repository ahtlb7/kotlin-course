package lessons.lesson16.homeworks.animals

import lessons.lesson16.homeworks.Colors
import lessons.lesson16.homeworks.printColored

class Cat : Animal() {
    override fun makeSound() {
        printColored("Cat: Meow!", Colors.PURPLE)
    }
}