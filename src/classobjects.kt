class person{
    //Attributes/Properties
    var name = "Tracy"
    var age = 21
    var gender = "Female"

    //Behavior/Method
    fun walk(){
        println("The person is walking")
    }
}

fun main() {
    var doctor = person()
    println(doctor.name)
    doctor.walk()
}