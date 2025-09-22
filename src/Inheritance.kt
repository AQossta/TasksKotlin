fun main() {
    val bicycle = Bicycle()
    bicycle.hasBasket = true
    bicycle.currentSpeed = 15

    print("Велосипед: ${bicycle.description}")

    val tandemBicycle = TandemBicycle()
    tandemBicycle.currentSpeed = 20
    tandemBicycle.numberOfRiders = 2
    tandemBicycle.hasBasket = true
    println("Велосипед-тандем: ${tandemBicycle.description}")

    val train = Train()
    train.makeNoise()

    val car = Car()
    car.currentSpeed = 25
    car.gear = 3
    print("Машина: ${car.description}")
}

open class Vehicle {
    var currentSpeed: Int = 0
    open val description: String
        get() = "Движется со скоростью ${currentSpeed} миль в час."

    open fun makeNoise() {

    }
}

open class Bicycle : Vehicle() {
    var hasBasket: Boolean = false
}

class TandemBicycle : Bicycle() {
    var numberOfRiders: Int = 0
}

class Train: Vehicle() {
    override fun makeNoise() {
        print("Choo Choo!")
    }
}

class Car: Vehicle() {
    var gear = 1
    override val description: String
        get() = super.description + " на передаче номер: $gear"
}












