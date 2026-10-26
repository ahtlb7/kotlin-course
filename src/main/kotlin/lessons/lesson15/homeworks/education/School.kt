package lessons.lesson15.homeworks.education

open class School(
    name: String,
    city: String,
    val gradesCount: Int
) : EducationalInstitution(name, city)