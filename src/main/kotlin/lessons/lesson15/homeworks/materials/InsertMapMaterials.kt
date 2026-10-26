package lessons.lesson15.homeworks.materials

class InsertMapMaterials : Materials() {
    fun insert(items: Map<String, String>) {
        val existingMaterials = extractMaterials()

        // 1. Ключи в обратном порядке
        items.keys.reversed().forEach { addMaterial(it) }
        // 2. Существующие материалы
        existingMaterials.forEach { addMaterial(it) }
        // 3. Значения
        items.values.forEach { addMaterial(it) }
    }
}