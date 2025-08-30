fun wordFrequency(text: String): Map<String, Int> {
    return text
        .lowercase()
        .split(" ", ",", ".", "!", "?", ";", ":")
        .filter { it.isNotEmpty() }
        .groupingBy { it }
        .eachCount()
}

fun main() {
    val text = "Кот любит молоко. Кот играет с мячом! Молоко вкусное."
    val frequencies = wordFrequency(text)

    println("Частота слов:")
    for ((word, count) in frequencies) {
        println("$word -> $count")
    }
}
