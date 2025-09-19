fun main() {
   displayPi()
    triple(value = 10)
    println(multiply(firstNumber = 5, secondNumber = 9))
}

fun displayPi() {
    println("3.1415926535")
}

fun triple(value: Int) {
    val result = value * 3
    println("Если вы умножите $value на 3, то получите $result")
}

fun multiply(firstNumber: Int, secondNumber: Int): Int {
    val result1 = firstNumber * secondNumber
    return result1
}




