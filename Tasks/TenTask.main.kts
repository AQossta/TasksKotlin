fun findLongestWord(text: String): String {
    val words = text.split("", ",", ".", "!", "?", ";", ":").filter {
        it.isNotEmpty()
    }

    var longest = ""
    for (word in words) {
     if (word.length > longest.length) {
      longest = word
     }
    }
    return longest
}

fun main() {
    val text = "Kotlin — современный, статически типизированный язык программирования."
    val longestWord = findLongestWord(text)
    println(longestWord)
}