package lessons.lesson15.homeworks.furniture

class Table(
    material: String,
    price: Double,
    val shape: String
) : Furniture(material, price)