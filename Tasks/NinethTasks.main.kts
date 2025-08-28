val numbers = arrayOf(1, 2, 3, 4, 5, 5)
val sum = numbers.sum()
println(sum)

fun factorialLoop(n: Int): Long {
    var result = 1L
    for (i in 1..n){
        result *= i
    }
    return result
}
 fun fibbonacci(n: Int): Long {
     var a = 0
     var b = 1
     for (i in 3..n) {
         val c = a + b
         print(c)
         a = b
         b = c
     }
 }

fum main(){
    fibbonacci(10)
}