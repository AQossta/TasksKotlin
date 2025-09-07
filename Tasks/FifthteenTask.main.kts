

val numbers = listOf(1, 2, 3, 4, 5)
val sum = numbers.sum()
println("Сумма чисел: $sum")

val sum2 = numbers.fold(0) { acc, num -> acc + num}
println(sum2)
