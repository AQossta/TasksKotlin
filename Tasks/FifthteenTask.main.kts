val num1 = readLine()?.toDoubleOrNull() ?: return
print("Введите оператор (+, -, *, /): ")
val operator = readLine()
print("Введите второе число: ")
val num2 = readLine()?.toDoubleOrNull() ?: return

val result = when (operator) {
    "+" -> num1 + num2
    "-" -> num1 - num2
    "*" -> num1 * num2
    "/" -> if (num2 != 0.0) num1 / num2 else "Ошибка: деление на ноль"
    else -> "Неверный оператор"
}

println("Результат: $result")

val numbers = listOf(1, 2, 3, 4, 5)
val sum = numbers.sum()
println("Сумма чисел: $sum")

val sum2 = numbers.fold(0) { acc, num -> acc + num}
println(sum2)
