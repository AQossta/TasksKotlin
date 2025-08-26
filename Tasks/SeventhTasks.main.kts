fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}
val a = readLine()!!.toInt()
val b = readLine()!!.toInt()
println("GCD($a, $b) = ${gcd(a, b)}")

