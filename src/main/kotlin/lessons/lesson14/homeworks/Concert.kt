package lessons.lesson14.homeworks

class Concert(
    val band: String,
    val location: String,
    val cost: Int,
    val capacity: Int
) {
    private var ticketsSold: Int = 0

    fun buyTicket() {
        if (ticketsSold < capacity) {
            ticketsSold++
            println("Билет успешно куплен!")
        } else {
            println("Все билеты распроданы!")
        }
    }

    fun printDetails() {
        val remaining = capacity - ticketsSold
        println("Концерт группы '$band' в $location. Цена билета: $cost. Осталось мест: $remaining из $capacity.")
    }
}