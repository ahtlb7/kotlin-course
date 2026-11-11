package lessons.lesson19.homeworks

class ListValidator<W : Number> : Validator<List<W?>> {
    override fun validate(element: List<W?>): Boolean {
        // Проверяем: нет null и нет нулей (0.0)
        return element.all { it != null && it.toDouble() != 0.0 }
    }
}