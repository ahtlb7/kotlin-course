package lessons.lesson19.homeworks

fun main() {
    println("=== 1. getMiddleElement ===")
    println(getMiddleElement(listOf(1, 2, 3)))       // 2
    println(getMiddleElement(listOf(1, 2, 3, 4)))    // null
    println(getMiddleElement(emptyList<String>()))   // null

    println("\n=== 2. ListHolder ===")
    val holder = ListHolder<String>()
    holder.add("Apple")
    holder.add("Banana")
    println(holder.get()) // [Apple, Banana]

    println("\n=== 3 и 4. Mapper и PhrasesToListOfStrings ===")
    val mapper = PhrasesToListOfStrings()
    println(mapper.map("Hello World from Kotlin")) // [Hello, World, from, Kotlin]
    println(mapper.map(listOf("A B", "C D")))      // [[A, B], [C, D]]

    println("\n=== 5. transposition ===")
    val map = mapOf("a" to 1, "b" to 2)
    println(transposition(map)) // {1=a, 2=b}

    println("\n=== 6, 7, 8, 9. Validator и его классы ===")
    val stringValidator = StringValidator()
    println("Строка 'Hello': ${stringValidator.validate("Hello")}")       // true
    println("Строка '   ': ${stringValidator.validate("   ")}")           // false
    println("Строка null: ${stringValidator.validate(null)}")             // false

    val oddValidator = OddValidator()
    println("Число 4 (четное): ${oddValidator.validate(4)}")              // true
    println("Число 5 (нечетное): ${oddValidator.validate(5)}")            // false

    val listValidator = ListValidator<Int>()
    println("Список [1, 2, 3]: ${listValidator.validate(listOf(1, 2, 3))}") // true
    println("Список [1, 0, 3]: ${listValidator.validate(listOf(1, 0, 3))}") // false
    println("Список [1, null, 3]: ${listValidator.validate(listOf(1, null, 3))}") // false
}