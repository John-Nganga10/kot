fun main() {
    //Break statement
    for(number in 30..40) {
        if (number == 35) {
            break
        }
        println(number)
    }

    //Continue statement
    for (character in 'a'..'h'){
        if (character == 'd'){
            continue
        }
           println("Character is $character")
    }
}