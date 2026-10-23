package lessons.lesson14.homeworks

class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        // Не добавляем, если уже максимум или такая полка уже есть
        if (shelves.size >= maxShelves || shelves.contains(shelf)) {
            return false
        }
        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }
        val itemsToRemove = shelves[index].getItems()
        shelves.removeAt(index)
        return itemsToRemove
    }

    fun addItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.canAccommodate(name)) {
                return shelf.addItem(name)
            }
        }
        return false
    }

    fun removeItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(name)) {
                return shelf.removeItem(name)
            }
        }
        return false
    }

    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        if (shelves.isEmpty()) {
            println("Стеллаж пуст.")
            return
        }
        println("--- Содержимое стеллажа ---")
        for (i in shelves.indices) {
            val shelf = shelves[i]
            val itemsText = if (shelf.getItems().isEmpty()) "пусто" else shelf.getItems().joinToString(", ")
            println("Полка [$i]: вместимость ${shelf.capacity}, занято ${shelf.capacity - shelf.getRemainingCapacity()}, доступно ${shelf.getRemainingCapacity()}")
            println("Предметы: $itemsText")
        }
        println("---------------------------")
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }

        val targetShelf = shelves[index]
        // Сортируем предметы с удаляемой полки по убыванию длины (сначала самые длинные)
        val itemsToRelocate = targetShelf.getItems().sortedByDescending { it.length }

        // Создаём список остальных полок (исключая удаляемую)
        val otherShelves = shelves.filterIndexed { i, _ -> i != index }

        val notReplacedItems = mutableListOf<String>()

        for (item in itemsToRelocate) {
            var placed = false
            for (shelf in otherShelves) {
                if (shelf.addItem(item)) {
                    placed = true
                    break // Предмет размещён, переходим к следующему
                }
            }
            if (!placed) {
                notReplacedItems.add(item) // Не удалось разместить
            }
        }

        // Удаляем целевую полку
        shelves.removeAt(index)

        return notReplacedItems.toList()
    }
}