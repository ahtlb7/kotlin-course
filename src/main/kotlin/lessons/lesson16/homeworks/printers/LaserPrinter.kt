package lessons.lesson16.homeworks.printers

import lessons.lesson16.homeworks.Colors
import lessons.lesson16.homeworks.Background
import lessons.lesson16.homeworks.printColored

class LaserPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        for (word in words) {
            // Черные буквы на белом фоне
            printColored(word, Colors.BLACK, Background.WHITE)
        }
    }
}