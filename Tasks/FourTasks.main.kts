val sentence = readLine()!!
val words = readLine()!!.split(" ")
val longest = words.maxByOrNull { it.length }
println("$longest")

val arr = arrayOf(4, 5, 6, 7, 8, 5)
val counts = mutableMapOf<Int, Int>()
for (x in arr) {
    counts[x] = counts.getOrDefault(x, 0) + 1
}
val unique = counts.filter { it.value == 1 }.keys
println("$counts")

fun factorial(n: Int): Long {
    return if (n <= 0) 1 else n * factorial(n - 1)
}
val n = readLine()!!.toInt()
println("$n! = ${factorial(n)}")

val primeNum = readLine()!!.toInt()
var isPrime = primeNum > 1
for (i in 2 until primeNum) {
    if (primeNum % i == 0) {
        isPrime = false
        break
    }
}
println("$primeNum саны ${if (isPrime) "жай сан" else "құрама сан"}")


