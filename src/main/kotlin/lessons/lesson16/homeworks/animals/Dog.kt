package lessons.lesson16.homeworks.animals

import lessons.lesson16.homeworks.Colors
import lessons.lesson16.homeworks.printColored

class Dog : Animal() {
    override fun makeSound() {
        printColored("Dog: Bark!", Colors.BLUE)
    }
}