val n = readLine()!!.toInt()
var sum = 0
for (i in 1..n) sum += i
println(sum)

for (i in 1..20){
    println("($i^2) = ${i * i}")
}

val arr = arrayOf(15, 12, 3, 7, 19, 4)
println("${arr.maxOrNull()}")

val word = readLine()!!
val reversed = word.reversed()
println("$reversed")

val fibN = readLine()!!.toInt()
var a = 0
var b = 1
for (i in 1..fibN) {
    print("$a")
    val next = a+b
    a = b
    b = next
}
