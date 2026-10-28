package lessons.lesson16.homeworks.cart

class ShoppingCart {
    private val cart = mutableMapOf<String, Int>()

    // 1. Базовый метод
    fun addToCart(itemId: String) {
        addToCart(itemId, 1)
    }

    // 2. Перегрузка с количеством
    fun addToCart(itemId: String, amount: Int) {
        cart[itemId] = cart.getOrDefault(itemId, 0) + amount
    }

    // 3. Перегрузка со словарём
    fun addToCart(items: Map<String, Int>) {
        for ((id, amount) in items) {
            addToCart(id, amount)
        }
    }

    // 4. Перегрузка со списком
    fun addToCart(itemIds: List<String>) {
        for (id in itemIds) {
            addToCart(id)
        }
    }

    // 5. Переопределение toString
    override fun toString(): String {
        if (cart.isEmpty()) return "Корзина пуста."

        val sb = StringBuilder()
        sb.append("=== Содержимое корзины ===\n")
        sb.append(String.format("%-10s | %-10s\n", "ID товара", "Количество"))
        sb.append("--------------------------\n")

        for ((id, amount) in cart) {
            sb.append(String.format("%-10s | %-10d\n", id, amount))
        }

        val totalItems = cart.values.sum()
        sb.append("--------------------------\n")
        sb.append("Всего артикулов: ${cart.size}\n")
        sb.append("Общее количество товаров: $totalItems")

        return sb.toString()
    }
}