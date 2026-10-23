package lessons.lesson14.homeworks

class Party(val location: String, val attendees: Int) {
    fun details() {
        println("Вечеринка проходит в $location, гостей: $attendees.")
    }
}