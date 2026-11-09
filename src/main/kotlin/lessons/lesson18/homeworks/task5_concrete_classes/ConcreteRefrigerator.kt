package lessons.lesson18.homeworks.task5_concrete_classes
import lessons.lesson18.homeworks.interfaces.LightEmitting
import lessons.lesson18.homeworks.task234_hierarchy.TemperatureAndOpenableEquipment

class ConcreteRefrigerator : TemperatureAndOpenableEquipment(), LightEmitting {
    override val maxTemperature: Int = 10

    override fun emitLight() {
        println("В холодильнике включилась лампочка.")
    }

    override fun completeLiteEmission() {
        println("В холодильнике выключилась лампочка.")
    }
}