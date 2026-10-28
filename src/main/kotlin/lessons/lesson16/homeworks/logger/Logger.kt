package lessons.lesson16.homeworks.logger

import lessons.lesson16.homeworks.Colors
import lessons.lesson16.homeworks.Background
import lessons.lesson16.homeworks.printColored

class Logger {
    // 1. Базовый метод
    fun log(message: String) {
        log(LogLevel.INFO, message)
    }

    // 2. Перегрузка с уровнем
    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO -> println("[INFO] $message")
            LogLevel.WARNING -> printColored("[WARNING] $message", Colors.YELLOW)
            LogLevel.ERROR -> printColored("[ERROR] $message", Colors.WHITE, Background.RED)
            LogLevel.DEBUG -> printColored("[DEBUG] $message", Colors.CYAN)
        }
    }

    // 3. Перегрузка со списком сообщений
    fun log(messages: List<String>) {
        for (msg in messages) {
            log(msg) // Вызывает базовый метод с уровнем INFO
        }
    }

    // 4. Перегрузка с объектом Exception
    fun log(exception: Exception) {
        val msg = exception.message ?: "Неизвестная ошибка"
        log(LogLevel.ERROR, msg)
    }
}