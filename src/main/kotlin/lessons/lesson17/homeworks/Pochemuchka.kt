package lessons.lesson17.homeworks

/*
1. Поле privateVal НЕ доступно в main() из BaseClass. В конструкторе ChildrenClass 
   объявлена своя локальная переменная privateVal (без модификатора private, значит public val), 
   именно к ней мы обращаемся в main(). Она перекрывает (shadowing) приватное поле родителя.
2. Поле protectedVal недоступно в main(), потому что protected разрешает доступ только 
   самому классу и его наследникам, но не внешнему коду (функции main).
*/
abstract class BaseClass(
    private val privateVal: String,
    protected val protectedVal: String,
    val publicVal: String
) {
    var publicField = "3. измени меня из функции main() на Антонио Бандераса и проверь через функцию getAll()" +
            "4. Доработай ChildrenClass таким образом, чтобы это получилось"
        set(value) {
            if (verifyPublicField(value)) {
                field = value
            }
        }
    protected var protectedField = "5. измени меня из функции main() через сеттер в наследнике"
    
    // 6. Добавить сеттер для privateField в BaseClass нельзя (запрещено условием), 
    // а из наследника private поле недоступно. Поэтому изменить его из main() невозможно без изменения BaseClass.
    private var privateField = "6. изменить меня нельзя (private в BaseClass)"

    fun getAll(): String {
        return mapOf(
            "privateVal" to privateVal,
            "protectedVal" to protectedVal,
            "publicVal" to publicVal,
            "publicField" to publicField,
            "protectedField" to protectedField,
            "privateField" to privateField,
            "generate" to generate(),
        ).map { "${it.key}: ${it.value}" }
            .joinToString("\n")
    }

    fun printText() {
        privatePrint()
    }

    // 7. Функция возвращает ProtectedClass. Так как сам класс ProtectedClass имеет 
    // модификатор protected, функцию, возвращающую его, нельзя делать public.
    protected open fun getProtectedClass() = ProtectedClass()
    
    protected open fun verifyPublicField(value: String): Boolean {
        return value.length < 3
    }

    // 8. При вызове getAll() у объекта ChildrenClass срабатывает полиморфизм. 
    // Вызывается переопределённый generate() из дочернего класса.
    open fun generate(): String {
        return "Это генерация из родительского класса"
    }

    private fun privatePrint() {
        println("Печать из класса BaseClass")
    }

    // 9. Функция возвращает PrivateClass, который является private. 
    // Методы, возвращающие private-типы, не могут быть public или protected.
    private fun getPrivateClass() = PrivateClass()
    
    protected class ProtectedClass()
    private class PrivateClass()
}

class ChildrenClass(
    // 10. Этот аргумент доступен в main(), потому что мы явно указали модификатор val, 
    // тем самым превратив аргумент конструктора в публичное свойство класса.
    val privateVal: String, 
    protectedVal: String,
    publicVal: String
) : BaseClass(privateVal, protectedVal, publicVal) {

    // 11. Функция getAll() доступна в main(), потому что она унаследована от BaseClass (public метод).
    
    // 12. При вызове printText() выведется "Печать из класса BaseClass". 
    // Переопределения не происходит, потому что private методы не являются виртуальными (не участвуют в полиморфизме), 
    // и в ChildrenClass создается просто новая, независимая функция с тем же именем.
    private fun privatePrint() {
        println("Печать из класса ChildrenClass")
    }

    override fun generate(): String {
        return "Это генерация из дочернего класса"
    }

    // 4. Переопределяем метод проверки, чтобы можно было установить "Антонио Бандерас" (длина > 3)
    override fun verifyPublicField(value: String): Boolean {
        return true
    }

    // 5. Добавляем публичный метод-сеттер для изменения protectedField
    fun updateProtectedField(newValue: String) {
        protectedField = newValue
    }
}