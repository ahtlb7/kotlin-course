package lessons.lesson18.homeworks.task234_hierarchy
import lessons.lesson18.homeworks.interfaces.Programmable

abstract class ProgrammableEquipment : PowerableEquipment(), Programmable {
    protected var currentProgram: String = "По умолчанию"

    override fun programAction(action: String) {
        if (isPowerOn) {
            currentProgram = action
            println("Выбрана программа: $action")
        } else {
            println("Ошибка: нельзя задать программу, устройство выключено!")
        }
    }

    override fun execute() {
        if (isPowerOn) {
            println("Выполняется программа: $currentProgram")
        } else {
            println("Ошибка: устройство выключено, выполнение невозможно.")
        }
    }
}