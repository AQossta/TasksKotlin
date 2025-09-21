fun main() {
    var cars = listOf(
        Car("BMW"),
        Car("Hyundai"),
        Car("Mercedes"),
        Car("Toyota")
    )

    for (car in cars) {
        println(car.make)
    }
}

data class Car(
    var make: String
)