package lessons.lesson15.homeworks.materials

class InsertFirstMaterial : Materials() {
    fun insert(item: String) {
        val existingMaterials = extractMaterials()
        addMaterial(item) // Новый элемент встает на индекс 0
        existingMaterials.forEach { addMaterial(it) }
    }
}