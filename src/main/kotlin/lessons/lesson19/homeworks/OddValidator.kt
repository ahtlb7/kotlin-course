package lessons.lesson19.homeworks

class OddValidator : Validator<Int> {
    override fun validate(element: Int): Boolean {
        // В задании просят проверить, что число чётное (несмотря на название OddValidator)
        return element % 2 == 0
    }
}