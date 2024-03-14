fun main() {
    var greeting = "Hello world"
    var firstname = "John"
    var lastname = "Nganga"

    //String concatenation
    println(firstname+ " " +lastname)
    println(firstname.plus(lastname))

    //Accessing a character in a string
    println(greeting[6])

    //Determining the index position of an element
    println(greeting.indexOf('H'))
    println(greeting.indexOf("world"))

    //Size of a string
    println(greeting.length)


    //Modifing a string
    println(greeting.uppercase())
    println(greeting.lowercase())

    //String interpolation
    println("Hello there, my name is $firstname $lastname")
}