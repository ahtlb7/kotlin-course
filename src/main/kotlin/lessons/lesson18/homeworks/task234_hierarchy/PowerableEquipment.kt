package lessons.lesson18.homeworks.task234_hierarchy
import lessons.lesson18.homeworks.interfaces.Powerable

abstract class PowerableEquipment : Powerable {
    var isPowerOn: Boolean = false
        protected set

    override fun powerOn() {
        isPowerOn = true
        println("Оборудование включено.")
    }

    override fun powerOff() {
        isPowerOn = false
        println("Оборудование выключено.")
    }
}