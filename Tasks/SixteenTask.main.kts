val num = readLine()!!.toInt()

var temp = num
var sum = 0

while (temp > 0) {
    sum += temp % 10
    temp /= 10
}
println(sum)

val n = readLine()!!.toInt()

var fact: Long = 1
for (i in 1..n){
    fact *= i
}
println(fact)