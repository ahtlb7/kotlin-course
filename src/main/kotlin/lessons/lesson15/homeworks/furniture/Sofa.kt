package lessons.lesson15.homeworks.furniture

class Sofa(
    material: String,
    price: Double,
    val isCorner: Boolean
) : Seating(material, price, maxWeight = 300)