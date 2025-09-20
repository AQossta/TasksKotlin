fun main(){
    for (index in 1..5){
        println("This number $index")
    }

    val names = listOf("Kanzhar", "Zhanel", "Aizere")
    for (name in names) {
        println("Hi $name")
    }

    for (letter in "ABCDEFG") {
        println("Bukva - $letter")
    }

    for ((index, letter1) in "ABCDEFG".withIndex()) {
        println("$index: $letter1")
    }

    var numberOfLives = 3
    while (numberOfLives > 0) {
        println(numberOfLives)
        numberOfLives -= 1
    }

    var numberOfLives2 = 3
    var stillAlive = true
    while (stillAlive) {
        println(numberOfLives2)
        numberOfLives2 -= 1
        if (numberOfLives2 == 0)
            stillAlive = false
    }

    var numOfLives = 3
    do {
        println("U menya vse eshe est $numOfLives lives")
        numOfLives -= 1
    } while (numOfLives > 0)


    for (counter in -10..10){
        println(counter)
        if (counter == 0){
            break
        }
    }

    for (i in 1..5 step 2){
        println("This number $i")
    }

    for (a in 5 downTo 1){
        println("This numbers $a")
    }
}