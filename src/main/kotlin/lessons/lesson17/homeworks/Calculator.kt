package lessons.lesson17.homeworks

import lessons.lesson17.homeworks.Operation

// Классы операций делаем private, чтобы ограничить к ним доступ извне
private class Addition : Operation("+") {
    override fun operate(expression: String): String {
        return split(expression).sum().toString()
    }
}

private class Subtraction : Operation("-") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] - operands[1]).toString()
    }
}

private class Multiplication : Operation("*") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] * operands[1]).toString()
    }
}

private class Division : Operation("/") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return if (operands[1] == 0.0) {
            "Division by zero"
        } else {
            (operands[0] / operands[1]).toString()
        }
    }
}

private class Modulo : Operation("%") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] % operands[1]).toString()
    }
}

// Внешняя операция для теста расширяемости
class EqualsOperation : Operation("==") {
    override fun operate(expression: String): String {
        val operands = split(expression)
        return (operands[0] == operands[1]).toString()
    }
}

class Calculator(private val customOperations: List<Operation> = emptyList()) {
    private val standardOperations = listOf(
        Addition(),
        Subtraction(),
        Multiplication(),
        Division(),
        Modulo()
    )
    
    private val allOperations = standardOperations + customOperations

    fun operate(expression: String): String {
        val operation = allOperations.firstOrNull { it.check(expression) }
        if (operation == null) {
            return "Unsupported operator in the expression '$expression'"
        }
        return operation.operate(expression)
    }
}

fun main() {
    // Создаем калькулятор и передаем ему кастомную операцию
    val calculator = Calculator(listOf(EqualsOperation()))

    println("3 + 5 = " + calculator.operate("3 + 5"))
    println("10 - 4 = " + calculator.operate("10 - 4"))
    println("3 * 5 = " + calculator.operate("3 * 5"))
    println("10 / 2 = " + calculator.operate("10 / 2"))
    println("10 % 3 = " + calculator.operate("10 % 3"))
    println("3 == 5 = " + calculator.operate("3 == 5"))
    println("3 ^ 2 = " + calculator.operate("3 ^ 2")) // Неподдерживаемая операция
}