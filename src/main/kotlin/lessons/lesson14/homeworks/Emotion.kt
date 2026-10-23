package lessons.lesson14.homeworks

class Emotion(val type: String, val intensity: Int) {
    fun express() {
        // Немного разнообразим вывод в зависимости от интенсивности
        val intensityDescription = when {
            intensity > 7 -> "очень сильная"
            intensity > 3 -> "умеренная"
            else -> "слабая"
        }
        println("Вы чувствуете $type. Интенсивность: $intensity ($intensityDescription).")
    }
}