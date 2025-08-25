val arr = arrayOf(85, 90, 78, 92, 88)
val avg = arr.average()
println(avg)

val products = mapOf("Bread" to 150, "Milk" to 300, "Apple" to 500)
val total = products.values.sum()
println(total)

val students = mapOf("Erkebulan" to 21, "Azhar" to 20, "Aizere" to 10)
val nameStudents = students.minByOrNull { it.value }
println(nameStudents)

