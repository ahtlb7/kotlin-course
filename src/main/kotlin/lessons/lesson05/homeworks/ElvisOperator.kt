package lessons.lesson05.homeworks

fun main() {

    // example 1
    // Рассчитать интенсивность звука после затухания.
    // Если коэффициент затухания неизвестен, используем 0.5.
    val baseIntensity: Double = 3.0
    val coefficient: Double? = 0.73 // может быть null
    val baseCoefficient: Double = 0.5
    val resultIntensity: Double = baseIntensity * (coefficient ?: baseCoefficient)
    println("resultIntensity = $resultIntensity")

    // example 2
    // Рассчитать полную стоимость доставки.
    // Страховка = 0.5% от стоимости груза.
    // Если стоимость не указана, берём 50.0.
    val defaultCost: Double = 50.0
    val cost: Double? = 20.0 // может быть null
    val deliveryCost: Double = 5.0
    val insuranceCoefficient: Double = 0.005
    // стоимость страховки
    val insuranceCost: Double = (cost ?: defaultCost) * insuranceCoefficient
    val totalCost: Double = deliveryCost + insuranceCost

    println("insuranceCost = $insuranceCost")
    println("totalCost = $totalCost")

    // example 3
    // Сообщить об ошибке, если атмосферное давление отсутствует.
    val pressure: String? = "34.6" // может быть null
    val attentionMessage: String = "Attention, pressure is lost"
    val pressureForLab: String = pressure ?: attentionMessage
    println("pressureForLab = $pressureForLab")
}