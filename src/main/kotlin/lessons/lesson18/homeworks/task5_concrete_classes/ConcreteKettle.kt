package lessons.lesson18.homeworks.task5_concrete_classes
import lessons.lesson18.homeworks.interfaces.WaterContainer
import lessons.lesson18.homeworks.task234_hierarchy.TemperatureAndOpenableEquipment

class ConcreteKettle : TemperatureAndOpenableEquipment(), WaterContainer {
    override val maxTemperature: Int = 100
    override val capacity: Int = 2

    override fun fillWater(amount: Int) {
        if (amount > capacity) {
            println("Слишком много воды! Максимум $capacity литра.")
        } else {
            println("В чайник набрано $amount литров воды.")
        }
    }

    override fun getWater(amount: Int) {
        println("Из чайника вылито $amount литров.")
    }
}