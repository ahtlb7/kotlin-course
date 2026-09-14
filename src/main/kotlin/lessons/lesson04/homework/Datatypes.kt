package lessons.lesson04.homework

// ===== Задание 1. Переменные v1–v44 =====

val v1: Int = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"

// Ошибка: Boolean-литералы в Kotlin пишутся со строчной буквы: false, а не FALSE
// val v6 = FALSE

val v7: Char = 'c'
val v8: Int = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Int> = listOf(3, 14)
val v15: Char = '9'
val v16: Int = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f

// Ошибка: backticks (`) используются для идентификаторов, а не для числовых литералов.
// Если это число, нужно писать: val v20 = 1.414
// val v20 = `1.414`

val v21: String = "Artificial Intelligence"
val v22: Array<Any> = arrayOf('x', "A")
val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Int = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"

// Ошибка: Boolean-литералы пишутся строчными: false, а не FALSE
// val v30 = FALSE

val v31: Double = 0.007

// Ошибка: использованы фигурные кавычки “”, а нужны обычные двойные "".
// Должно быть: val v32 = "🤯"
// val v32 = “🤯”

val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)

// Ошибка: использованы фигурные одинарные кавычки ‘’, нужны обычные одинарные ''.
// Кроме того, в Char может быть только один символ, а тут '65535'.
// val v34 = ‘65535’

val v35: Long = 72057594037927935L
val v36: Float = 2.71828f
val v37: Double = 101.0101
val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Int = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f

// Ошибка: Boolean-литералы пишутся строчными: true, а не TRUE
// val v44 = TRUE


// ===== Задание 2. Подбор типов =====
// Ниже приведены примеры переменных с подходящими типами.
// Значения можно заменить на свои.

val mediumLetter: Char = 'A'                     // буква медиума
val sugarSpoons: Int = 2                         // ложки сахара в чашку
val foodDeliveryExpenses: List<Double> = listOf(199.99, 250.50) // расходы на доставку
val queueLengthInNanometers: Double = 0.000000001 // длина очереди до миллиардной доли см
val isBugClosed: Boolean = true                  // закрыт ли баг
val kettleWhistlesPerDay: Int = 5                // свистки чайника за день
val catKeyPresses: Long = 1_000_000L             // нажатия кота на клавиатуру
val starCountAttempts: Long = 10_000_000_000L    // попытки пересчитать звёзды
val airMassInGrams: Double = 0.0001              // масса воздуха в долях грамма
val startupLosses: Map<String, Double> = mapOf("Startup" to 1_000_000.0) // стартап → потери
val autoReply: String = "починилось само"        // строка для тикетов
val uselessMeetingTopics: List<String> = listOf("Тема 1", "Тема 2") // темы для митингов