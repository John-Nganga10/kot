fun main() {
    //Arithmetic operators
    var num1 = 45
    var num2 = 34

    println(num1 + num2)
    println(num1 - num2)
    println(num1 * num2)
    println(num1 / num2)
    println(num1 % num2)

    //Logic operators - and, or, not
    println(num1 < num2 && num2 != num1) //and
    println(num1 < num2 || num2 != num1) //or
    println(!(num1< num2|| num2 != num1)) //not

    //Comparison operators
    println(num1 < num2)
    println(num1 > num2)
    println(num1 <= num2)
    println(num1 >= num2)
    println(num1 == num2)//Equal to
    println(num1 != num2)//Not equal to

    //Assignment operators
    var y = 28
    y += 2
    println(y)

    var x = 45
    x %= 2
    println(x)


}