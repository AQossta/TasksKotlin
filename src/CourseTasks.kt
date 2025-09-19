fun main() {
    introduceMyself()
    progressUpdate(1984, 10000)
    println(maxNumber(firstNum = 6, secondNum = 9))
}

//TASK-1
fun introduceMyself(){
    println("Hello! I'm Azhara. Nice to meet you!")
}

//TASK-2
fun progressUpdate(steps: Int, goal: Int) {
    val percent = steps/goal*100
    when (percent) {
        in 0..10 -> println("У вас хорошее начало")
        in 10..50 -> println("Вы почти на полпути!")
        in 50..90 -> println("Вы на полпути!")
        in 90..99 -> println("Вы почти у цели!")
        else -> println("Вы превзошли свою цель!")
    }
}

//TASK-3
fun maxNumber(firstNum: Int, secondNum: Int): Int {
    return if (firstNum > secondNum) firstNum else secondNum
}