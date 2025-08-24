val arr = arrayOf(10, 4, 7, 22, 3, 15)
val min = arr.minOrNull()
println("$min")

val arr2 = arrayOf(5, 1, 4, 2, 8)
for (i in arr2.indices) {
    for (j in 0 until arr2.size - i - 1) {
        if (arr2[j] > arr2[j + 1]) {
            val temp = arr2[j]
            arr2[j] = arr2[j + 1]
            arr2[j + 1] = temp
        }
    }
}
println("$arr2")


val arr3 = arrayOf(1, 3, 5, 7, 9, 11, 13)
val terget = readLine()!!.toInt()
var left = 0
var right = arr3.size - 1
var found = false
while (left <= right) {
    val mid = (left + right) / 2
    if (arr3[mid] == terget) {
        found = true
        break
    } else if (arr3[mid] < terget) {
        left = mid + 1
    } else {
        right = mid - 1
    }
}
println("$found")