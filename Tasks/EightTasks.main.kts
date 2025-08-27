val matrix = arrayOf(
    arrayOf(1, 2, 3),
    arrayOf(4, 5, 6)
)
val rows = matrix.size
val cols = matrix[0].size
val transposed = Array(cols) { Array(rows) { 0 } }
for (i in 0 until rows) {
    for (j in 0 until cols) {
        transposed[j][i] = matrix[i][j]
    }
}
println("Транспониция нәтижесі:")
for (row in transposed) {
    println(row.joinToString(" "))
}