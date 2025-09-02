fun main() {
    print("Введите число: ")
    val num = readLine()!!.toInt()

    val result = if (num % 2 == 0) "чётное" else "нечётное"
    println("Число $num $result")
}

fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

fun main() {
    print("Введите число: ")
    val num = readLine()!!.toInt()

    if (isEven(num)) {
        println("Число $num чётное")
    } else {
        println("Число $num нечётное")
    }
}
