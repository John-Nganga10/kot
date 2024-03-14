import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    print("Enter first number:")
    var num1 = input.nextInt()

    print("Enter second number")
    var num2 = input.nextInt()

    print("Enter operator")
    var operator = input.nextInt()
    var result = when(operator){
        1 -> num1 + num2
        2 -> num1 - num2
        3 -> num1 * num2
        4 -> num1 / num2
        else -> "Invalid operator"
    }
   println("Enter the  student's marks:")
    val marks = readLine()!!.toInt()
    val grade = when (marks){
        in 90..100 -> "A"
        in 70..89 -> "B"
        in 50 ..69 ->"C"
        in 30..49 ->"D"
        in 0..29 -> "E"
        else -> "Invalid Marks"
    }
    println("The students grade is $grade")

}
