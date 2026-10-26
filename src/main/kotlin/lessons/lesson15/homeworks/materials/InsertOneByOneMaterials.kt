package lessons.lesson15.homeworks.materials

class InsertOneByOneMaterials : Materials() {
    fun insert(items: List<String>) {
        val existingMaterials = extractMaterials()
        val maxSize = maxOf(items.size, existingMaterials.size)

        for (i in 0 until maxSize) {
            if (i < items.size) {
                addMaterial(items[i])
            }
            if (i < existingMaterials.size) {
                addMaterial(existingMaterials[i])
            }
        }
    }
}