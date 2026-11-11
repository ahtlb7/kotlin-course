package lessons.lesson19.homeworks

class StringValidator : Validator<String?> {
    override fun validate(element: String?): Boolean {
        // Проверяем, что не null, не пустая и не состоит из пробелов
        return !element.isNullOrBlank()
    }
}