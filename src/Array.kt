fun main(){
    //TASK-1
    val array: Array<Int> = arrayOf(10,11,59,56,87,62,34,67,94,65,21)
    println(array.sum())

    //TASK-2
    val arrayStr: Array<String> = arrayOf("Apple", "Banana", "Orange")
    println(arrayStr.reversed())

    //TASK-3
    val boolArray: Array<Boolean> = arrayOf(true, false, true, true, false)
    println(boolArray.filter { it })
    println(boolArray.groupBy { it })

    //TASK-4
    val mutableList: MutableList<String> = mutableListOf("book", "notebook", "laptop")
    println(mutableList.removeAt(0))

    //TASK-5
    val arrayList: ArrayList<Int> = arrayListOf(65,6,8,1,95,87,2,35,46,55)
    println(arrayList.average())

    //TASK-6
    val numbers = listOf(1, 2, 5, 4, 5, 44, 36, 55, 5)
    println(numbers.count{it == 5})

}