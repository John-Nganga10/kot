import java.awt.Shape

//Parent class
open class shape{
    fun draw(){
        println("Drawing a shape")
    }

}
//Child class
class Rhombus:Shape(){
    override fun draw(){
        println("Drawing a rhombus")
    }
}
class Parallelogram:shape(){
    override fun draw(){
        println("Drawing a parallelogram")
    }
}
fun main(){
    var  s = Shape()

    var  r = Rhombus()

    var  p = Parallelogram()
}