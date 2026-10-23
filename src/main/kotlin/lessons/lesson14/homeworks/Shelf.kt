package lessons.lesson14.homeworks

class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

    fun addItem(name: String): Boolean {
        if (!canAccommodate(name)) {
            return false
        }
        items.add(name)
        return true
    }

    fun removeItem(name: String): Boolean {
        return items.remove(name)
    }

    fun canAccommodate(name: String): Boolean {
        val currentLength = items.sumOf { it.length }
        return currentLength + name.length <= capacity
    }

    fun containsItem(name: String): Boolean {
        return items.contains(name)
    }

    fun getItems(): List<String> {
        return items.toList() // возвращаем неизменяемую копию
    }

    // Вспомогательный метод для подсчёта оставшегося места
    fun getRemainingCapacity(): Int {
        return capacity - items.sumOf { it.length }
    }
}