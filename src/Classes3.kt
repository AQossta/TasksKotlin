fun main() {
    var cars = listOf(
        Cars("BMW"),
        Cars("Hyundai"),
        Cars("Mercedes"),
        Cars("Toyota")
    )

    for (car in cars) {
        println(car.make)
    }
}

data class Cars(
    var make: String
)