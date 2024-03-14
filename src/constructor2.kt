class Dog(var name:String,var breed:String,var weight:Int){
    fun move(movement:String){
        println("The dog is $movement")

    }
}

fun main() {
    var dog1 = Dog("Murife", "Rotweiller",20)
    var dog2 = Dog("Bosco","Bulldog",30)

    println("Dog1 breed is ${dog1.breed}")
    dog2.move("running")
}