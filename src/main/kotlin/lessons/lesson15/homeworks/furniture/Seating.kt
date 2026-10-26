package lessons.lesson15.homeworks.furniture

open class Seating(
    material: String,
    price: Double,
    val maxWeight: Int
) : Furniture(material, price)