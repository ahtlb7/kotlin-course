package lessons.lesson18.homeworks

import lessons.lesson18.homeworks.task5_concrete_classes.*

fun main() {
    println("=== ТЕСТ ХОЛОДИЛЬНИКА ===")
    val fridge = ConcreteRefrigerator()
    fridge.powerOn()
    fridge.emitLight() // Новый метод
    fridge.setTemperature(5)
    fridge.programAction("Быстрое охлаждение")
    fridge.execute()
    fridge.powerOff()

    println("\n=== ТЕСТ СТИРАЛЬНОЙ МАШИНЫ ===")
    val washer = ConcreteWashingMachine()
    washer.powerOn()
    washer.connectToDrain() // Новый метод
    washer.fillWater(30)    // Новый метод
    washer.setTemperature(60)
    washer.drain()          // Новый метод
    washer.powerOff()

    println("\n=== ТЕСТ ЧАЙНИКА ===")
    val kettle = ConcreteKettle()
    // Проверяем, что нельзя задать температуру выключенному устройству
    kettle.setTemperature(90)
    kettle.powerOn()
    kettle.fillWater(1)     // Новый метод
    kettle.setTemperature(90)
    kettle.programAction("Кипячение")
    kettle.execute()
    kettle.powerOff()

    println("\n=== ТЕСТ ДУХОВКИ ===")
    val oven = ConcreteOven()
    oven.powerOn()
    oven.setTimer(45)       // Новый метод
    oven.open()
    oven.setTemperature(200)
    oven.programAction("Выпечка")
    oven.execute()
    oven.close()
    oven.powerOff()
}