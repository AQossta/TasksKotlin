val num = readLine()!!.toInt()

var temp = num
var sum = 0

while (temp > 0) {
    sum += temp % 10
    temp /= 10
}
println(sum)