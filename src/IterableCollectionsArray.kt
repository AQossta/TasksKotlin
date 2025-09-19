fun main() {
    //List
    val readOnlyList: List<Int> = listOf(1,2,3)
    readOnlyList.size
    println(readOnlyList)

    //MutableList
    val mutableList: MutableList<Int> = mutableListOf(1,2,3)
    mutableList.add(4)
    println(mutableList)

    //Set
    val readOnlySet: Set<String> = setOf("a", "b", "c")
    readOnlySet.count()
    println(readOnlySet)

    //MutableSet
    val mutableSet: MutableSet<String> = mutableSetOf("a", "b", "c")
    mutableSet.add("d")
    mutableSet.add("b")
    println(mutableSet)

    //Map
    val readOnlyMap: Map<String, Int> = mapOf("one" to 1, "two" to 2, "three" to 3)
    readOnlyMap.size
    println(readOnlyMap)

    //MutableMap
    val mutableMap: MutableMap<String, Int> = mutableMapOf("one" to 1, "two" to 2)
    mutableMap["five"] = 5
    println(mutableMap)

    //Array Неизменяемый массив
    val array: Array<Int> = arrayOf(1,2,3,4,5)
    println(array)

    val intArray = intArrayOf(1,2,3,4,5)
    println(intArray)

    val doubleArray = doubleArrayOf(1.0,2.0,3.0)
    println(doubleArray)

    //Изменяемый массив
    val mutableList1: ArrayList<Int> = arrayListOf(1,2,3)
    mutableList1.add(4)
    println(mutableList1)

    //.add()
    val mutableNumbers = mutableListOf(1,2,3,4,5)
    mutableNumbers.add(6)
    println(mutableNumbers)

    mutableNumbers.add(element = 5)
    println(mutableNumbers)
    mutableNumbers.add(index = 1, element = 6)
    println(mutableNumbers)

    //.addAll()
    mutableNumbers.addAll(listOf(7, 8))
    println(mutableNumbers)

    //.remove()
    mutableNumbers.remove(6)
    println(mutableNumbers)

    //.removeAt()
    mutableNumbers.removeAt(3)
    println(mutableNumbers)

    // Использование MutableList
    val mutableNum = mutableListOf(1,2,3,4,5)
    val anotherNum = mutableListOf(1,2,3,7,9)

    //.removeAll()
    mutableNum.removeAll(anotherNum)
    println(mutableNum)

    //.clear()
    mutableNum.clear()

    //.componentN()
    val numbers = mutableListOf(1,2,3,4,5)
    println("${numbers.component1()}, ${numbers.component4()}")

    //.count()
    println(numbers.count())
    println(numbers.count {it == 4})
    //.size
    println(numbers.size)

    //.filter()
    val numbers2 = listOf(1,2,3,4,5)
    val evenNumbers = numbers2.filter {it % 2 == 0}
    println(evenNumbers)

    //.map()
    val doubleNumbers = numbers2.map{it * 2}
    println(doubleNumbers)

    //.groupBy()
    val groupByParity = numbers2.groupBy { it % 2 == 0 }
    println(groupByParity)

    //.forEach()
    numbers2.forEach {
        println(it)
    }

    //.first()
    println(numbers2.first())
    //.last()
    println(numbers2.last())

    //.indexOf()
    println(numbers2.indexOf(3))
    println(numbers2.indexOf(10))

    //.contains()
    println(numbers2.contains(3))
    println(numbers2.contains(10))

    //.reduce()
    val sum = numbers2.reduce { acc, num -> acc + num }
    println(sum)
    println(numbers2.sum())
    println(numbers2.reduce { acc, i -> acc - i })

    //.fold()
    val sumWithFold = numbers2.fold(10) {acc, i -> acc + i}
    println(sumWithFold)

}
