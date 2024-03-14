//Parent class/Base class/Super class
open class Animal{
    var age = 3
    var gender = "female"

    fun move (movement: String){
        println("Animal is $movement")
    }
}
//Child class
class  Duck:Animal(){
    var color = "white"
    fun sound(){
        println("The duck is quacking")
    }
}
open class Fish:Animal(){
    var hasScales = true
    var hasFins = true
    fun eat(){
        println("Fish is eating")
    }
}
fun main(){
    var elephant = Animal()

    var duckling = Duck()
    duckling.move("Swimming")
    println(duckling.color)
    var nileperch = Fish()
    nileperch.hasScales
}