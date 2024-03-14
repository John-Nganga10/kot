class Employee(var firstname:String,var age:Int,var gender:String, var position:String,var salary:Double) {
    fun role(task: String) {
        println("The role is $task")
    }

}

fun main() {
    var employee1 = Employee("John Nganga",25, "male", "Manager", 125000.00)
    var employee2 =Employee("Jane Muthoni", 32, "female", "Resource manager", 250000.00)
    println(employee1.firstname)
    println("Employee1 is ${employee1.age} years old.")

}