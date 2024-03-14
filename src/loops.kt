fun main() {
    //While loop
    var number = 20
    while (number <=25){
        println("Number is $number")
        number++
    }

    //Decreament
    var num1 = 100
    while (num1 >= 90){
        println("Number is $num1")
        num1--

    }


    //Do..while loop
    var x = 34
    do {
        println(x)
        x++
    }while (x <= 40)

    //For loop
    var  devices = arrayOf("Laptop", "Phone", "Tablet")
    for (device in devices){
        println("Device is $device")
    }

    //Max
    var marks = arrayOf(90,60,40,20)
    for (max in marks){
        println("The scored a $max")
    }

    for (mynumber in 50..60) {
        println(mynumber)
    }

    for (letter in 'a'..'z' ){
        println(letter)

    }
}