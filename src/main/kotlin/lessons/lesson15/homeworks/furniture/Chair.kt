package lessons.lesson15.homeworks.furniture

class Chair(
    material: String,
    price: Double,
    val hasArmrests: Boolean
) : Seating(material, price, maxWeight = 150)