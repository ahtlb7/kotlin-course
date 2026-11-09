package lessons.lesson18.homeworks.task5_concrete_classes
import lessons.lesson18.homeworks.interfaces.Timable
import lessons.lesson18.homeworks.task234_hierarchy.TemperatureAndOpenableEquipment

class ConcreteOven : TemperatureAndOpenableEquipment(), Timable {
    override val maxTemperature: Int = 250

    override fun setTimer(time: Int) {
        if (isPowerOn) {
            println("Таймер духовки установлен на $time минут.")
        } else {
            println("Ошибка: духовка выключена, таймер не работает.")
        }
    }
}