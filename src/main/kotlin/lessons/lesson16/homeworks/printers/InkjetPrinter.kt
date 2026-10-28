package lessons.lesson16.homeworks.printers

import lessons.lesson16.homeworks.Colors
import lessons.lesson16.homeworks.Background
import lessons.lesson16.homeworks.printColored

class InkjetPrinter : Printer() {
    override fun print(text: String) {
        val words = text.split(" ")
        val colorPairs = listOf(
            Colors.RED to Background.YELLOW,
            Colors.BLUE to Background.GREEN,
            Colors.PURPLE to Background.CYAN,
            Colors.GREEN to Background.RED,
            Colors.CYAN to Background.PURPLE
        )

        for ((index, word) in words.withIndex()) {
            val (textColor, bgColor) = colorPairs[index % colorPairs.size]
            printColored(word, textColor, bgColor)
        }
    }
}