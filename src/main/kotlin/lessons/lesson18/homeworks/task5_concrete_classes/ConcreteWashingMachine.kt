package lessons.lesson18.homeworks.task5_concrete_classes
import lessons.lesson18.homeworks.interfaces.Drainable
import lessons.lesson18.homeworks.interfaces.WaterContainer
import lessons.lesson18.homeworks.task234_hierarchy.TemperatureAndOpenableEquipment

class ConcreteWashingMachine : TemperatureAndOpenableEquipment(), WaterContainer, Drainable {
    override val maxTemperature: Int = 90
    override val capacity: Int = 50

    override fun fillWater(amount: Int) {
        if (isPowerOn) println("В стиральную машину набрано $amount литров воды.")
        else println("Ошибка: машина выключена, вода не набирается.")
    }

    override fun getWater(amount: Int) {
        println("Из стиральной машины забрано $amount литров.")
    }

    override fun connectToDrain() {
        println("Шланг стиральной машины подключен к сливу.")
    }

    override fun drain() {
        if (isPowerOn) println("Стиральная машина сливает воду...")
        else println("Ошибка: машина выключена.")
    }
}