val arr = arrayOf(85, 90, 78, 92, 88)
val avg = arr.average()
println(avg)

val products = mapOf("Bread" to 150, "Milk" to 300, "Apple" to 500)
val total = products.values.sum()
println(total)

val students = mapOf("Erkebulan" to 21, "Azhar" to 20, "Aizere" to 10)
val nameStudents = students.minByOrNull { it.value }
println(nameStudents)

var balance = readLine()!!.toInt()
while (true) {
    val op = readLine()!!.toInt()
    if (op == 0) break
    balance += op
    println("Жаңа қалдық: $balance")
}
println("Соңғы қалдық: $balance")

val exam = arrayOf(45, 67, 80, 30, 95, 50)
val failed = exam.count{ it < 50}
println(failed)