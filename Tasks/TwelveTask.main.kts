fun isPalidromeNumber(number: Int): Boolean {
    val str = number.toString()
    return str == str.reversed()
}

fun main() {
    val numbers = listOf(121, 1331, 123, 10, 12321)
    for (n in numbers) {
        if (isPalidromeNumber(n)) {
            println("$n is a palindrome")
        } else {
            println("$n is not a palindrome")
        }
    }
}