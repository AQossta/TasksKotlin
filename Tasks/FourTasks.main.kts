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



