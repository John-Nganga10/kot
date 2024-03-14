fun main() {
    var languages = arrayOf("Kotlin", "Python","Java script","PHP","Java","Html","C++")
    println(languages[1])

    //Reassigning values
    languages[1] = "C++"
    println(languages[1])

    //Accessing elements
    for (x in languages){
        println(x)
    }
}