val a = readLine()!!.toInt()
val b = readLine()!!.toInt()
var minNum = if (a < b) a else b
println(minNum)

val c = readLine()!!.toInt()
if (c % 2 == 0) {
    println("Число $c чётное")
} else {
    println("Число $c нечётное")
}