package lessons.lesson16.homeworks.shapes

class Square(val side: Double) : Shape() {
    override fun area(): Double {
        return side * side
    }
}