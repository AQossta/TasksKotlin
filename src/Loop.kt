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

    //TASK-1.1
    for (num in 1..100){
        println(num)
    }

    //TASK-1.2
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    for ((index, value ) in alphabet.withIndex()){
        println("$index: $value")
    }

    //TASK-2
    val physicalExercises = listOf("Running", "Jump rope", "Burpees", "Jumping jacks")
    val bmp = listOf("140-170bmp", "150-170bmp", "160-180bmp", "130-160bmp")

    for (exercises in physicalExercises) {
        println("$exercises: ${bmp.component1()}")
        println("$exercises: ${bmp.component2()}")
        println("$exercises: ${bmp.component3()}")
        println("$exercises: ${bmp.component4()}")
    }

    //TASK-3
    val text = "Столица Казахстана - Астана"
    var count = 0

    for (ch in text) {
        if (ch == 'а' || ch == 'А') {
            count++
        }
    }
    println(count)

    //TASK-4
    val listNumbers = listOf(0, 1, 2, 3, 4, 1, 5, 6, 2, 1)
    var count1 = 0

    for (one in listNumbers){
        if (one == 1){
            count1++
        }
    }
    println(count1)

    //TASK-5
    for (numbers2 in 2..20 step 2){
        print(numbers2)
    }
}