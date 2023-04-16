package oca

import oca.chapter4.Person

class ConvertJavaToKotlin {
    fun fetchName() {
        val person = Person("Alice")
        println(person.name)
    }

    fun updateWeather(degrees: Int) {
        val description: String
        val color: Color
        if (degrees < 10) {
            description = "cold"
            color = Color.Blue
        } else if (degrees < 25) {
            description = "mild"
            color = Color.Yellow
        } else {
            description = "hot"
            color = Color.Red
        }
    }
}