package lessons.lesson17.homeworks

class GameMachine(
    val color: String,
    val model: String,
    val hasGamepad: Boolean
) {
    private var isOn: Boolean = false
    private var osIsLoaded: Boolean = false
    private val games: MutableList<String> = mutableListOf("Mario", "Bomber", "Tetris", "Death stranding")

    private var balance: Double = 0.0
    private var owner: String = ""
    var supportPhone: String = ""
        private set

    private var gameSessionIsCharged: Boolean = false
    private val sessionCost: Double = 5.0
    private var pin: String = "1234"

    fun turnOn() {
        isOn = true
        loadOs()
    }

    fun turnOff() {
        shutDownOs()
        isOn = false
    }

    private fun loadOs() {
        osIsLoaded = true
        println("ОС загружена")
    }

    private fun shutDownOs() {
        osIsLoaded = false
        println("Работа ОС завершена")
    }

    fun showGames(): List<String> {
        return games.toList() // Возвращаем неизменяемую копию
    }

    fun play(gameName: String) {
        if (!gameSessionIsCharged) {
            println("Оплати игру прежде чем начать")
            return
        }
        if (gameName !in games) {
            println("Игра '$gameName' не найдена")
        } else {
            println("Игра '$gameName' запущена")
        }
        gameSessionIsCharged = false // Сеанс сгорает после запуска
    }

    fun payForGameSession() {
        balance += sessionCost
        gameSessionIsCharged = true
        println("Сеанс оплачен. Баланс автомата: $balance")
    }

    fun withdrawCash(pin: String): Double {
        if (pin != this.pin) {
            println("Неверный пин-код")
            return 0.0
        }
        return openSafeAndGiveCash()
    }

    private fun openSafeAndGiveCash(): Double {
        val withdrawnAmount = balance
        balance = 0.0
        println("Выдано наличных: $withdrawnAmount")
        return withdrawnAmount
    }
}