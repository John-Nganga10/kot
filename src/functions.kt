fun main() {

    //Predefined function
    var y = Math.sqrt(169.0)
    println("The square root of 169.0 is $y")

    var x = Math.min(45,12)
    println("The minimum value is $x")

    var z = Math.max(45,12)
    println("The maximum value is $z")

    var c = Math.round(67.45)
    println("The rounded off value is $c")

    name()
    quotient(12,3)
    quotient(45,5)

    developers("Peter Kimani",23)
    developers("Rose Mary",31)
}
//User-defined functions
fun name(){
    println("John Nganga")
}

fun quotient(num1:Int,num2:Int){
    println(num1/num2)
}

fun developers(name:String,age:Int){
    println("$name is $age years old")
}