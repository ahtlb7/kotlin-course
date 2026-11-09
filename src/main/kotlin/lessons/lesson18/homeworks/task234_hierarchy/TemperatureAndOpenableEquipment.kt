package lessons.lesson18.homeworks.task234_hierarchy
import lessons.lesson18.homeworks.interfaces.Openable
import lessons.lesson18.homeworks.interfaces.TemperatureRegulatable

abstract class TemperatureAndOpenableEquipment : ProgrammableEquipment(), TemperatureRegulatable, Openable {
    protected var currentTemperature: Int = 0
    var isOpen: Boolean = false
        protected set

    override fun setTemperature(temp: Int) {
        if (isPowerOn) {
            currentTemperature = temp.coerceIn(0, maxTemperature)
            println("Температура установлена на $currentTemperature°C (Макс: $maxTemperature°C).")
        } else {
            println("Ошибка: нельзя изменить температуру, устройство выключено!")
        }
    }

    override fun open() {
        isOpen = true
        println("Дверца открыта.")
    }

    override fun close() {
        isOpen = false
        println("Дверца закрыта.")
    }
}