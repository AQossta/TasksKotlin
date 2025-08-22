val text = readLine()!!
val freq = mutableMapOf<Char, Int>()
for (ch in text) {
    freq[ch] = freq.getOrDefault(ch, 0) + 1
}
println("$freq")

val arr = arrayOf(2, 7, 4, 9, 12, 5, 6)
val evenSum = arr.filter { it % 2 == 0 }.sum()
println("$evenSum")

val word = readLine()!!
val isPalindrome = word == word.reversed()
println("$isPalindrome")

val arr2 = arrayOf(15, 3, 9, 21, 7, 12)
val sortedArr = arr2.sorted()
println("$sortedArr")

val arr3 = arrayOf(1, 3, 5, 3, 7, 1, 9, 5)
val counts = mutableMapOf<Int, Int>()
for (num in arr3) {
    counts[num] = counts.getOrDefault(num, 0) + 1
}
println("$counts")

val num = readLine()!!.toInt()
var temp = num
var digitSum = 0
while (temp > 0) {
    digitSum += temp % 10
    temp /= 10
}
println("$digitSum")
