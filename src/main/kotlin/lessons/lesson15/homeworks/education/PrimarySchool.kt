package lessons.lesson15.homeworks.education

class PrimarySchool(
    name: String,
    city: String,
    val hasAfterSchoolCare: Boolean
) : School(name, city, gradesCount = 4)