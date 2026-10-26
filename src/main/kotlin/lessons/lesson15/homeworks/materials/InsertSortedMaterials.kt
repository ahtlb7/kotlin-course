package lessons.lesson15.homeworks.materials

class InsertSortedMaterials : Materials() {
    fun insert(item: String) {
        val sortedMaterials = (extractMaterials() + item).sorted()
        sortedMaterials.forEach { addMaterial(it)
        }
    }
}