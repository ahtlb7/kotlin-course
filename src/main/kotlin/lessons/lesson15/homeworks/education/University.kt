package lessons.lesson15.homeworks.education

class University(
    name: String,
    city: String,
    val facultiesCount: Int
) : EducationalInstitution(name, city)