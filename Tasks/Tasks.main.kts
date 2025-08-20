val a = readLine()!!.toInt()
val b = readLine()!!.toInt()
println("${a + b}")

val c = readLine()!!.toInt()
val d = readLine()!!.toInt()
val e = readLine()!!.toInt()
println(maxOf(c, d, e))

val f = readLine()!!.toInt()
if(f % 2 == 0){
    println("Четное")
} else {
    println("Нечетное")
}

val g = readLine()!!.toInt()
var fact = 1L
for (i in 1..g) {
    fact *= i
}
println(fact)

val h = readLine()!!.toInt()
for(i in 1..10){
    println("$h * $i = ${h * i}")
}