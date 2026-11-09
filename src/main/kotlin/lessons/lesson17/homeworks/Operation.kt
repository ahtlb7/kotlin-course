package lessons.lesson17.homeworks

abstract class Operation(private val operator: String) {
    abstract fun operate(expression: String): String

    fun check(expression: String): Boolean {
        return expression.contains(operator)
    }

    protected fun split(expression: String): List<Double> {
        return expression.split(operator)
            .map { it.trim() }
            .map { it.toDouble() }
    }
}