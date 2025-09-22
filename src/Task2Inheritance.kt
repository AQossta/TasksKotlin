fun main() {
    val car = Vehicle3("Toyota", "Camry")
    val motorcycle = Motorcycle("Yamaha", "R1")

    // Работа с машиной
    car.start()
    car.refuel(30)
    println("Уровень топлива у машины: ${car.getFuelLevel()}")
    car.stop()

    println()

    // Работа с мотоциклом
    motorcycle.start()
    motorcycle.refuel(15)
    println("Уровень топлива у мотоцикла: ${motorcycle.getFuelLevel()}")
    motorcycle.stop()
}

//TASK-2
interface VehicleAction{
    fun start()
    fun stop()
    fun getFuelLevel()
}

open class Vehicle3(
    val make: String,
    val model: String
) : VehicleAction {
    open val fuelCapacity: Int = 0
    private var fuelLevel: Int = 0


    override fun start() {
        println("$make $model начинает движение.")
    }

    override fun stop() {
        println("$make $model останавливается.")
    }

    override fun getFuelLevel() {
        println("-")
    }

    fun refuel(amount: Int) {
        fuelLevel += amount
        if (fuelLevel > fuelCapacity) {
            fuelLevel = fuelCapacity
        }
        println("$make $model заправлен. Текущий уровень топлива: $fuelLevel/$fuelCapacity")
    }
}

class Motorcycle(make: String, model: String) : Vehicle3(make, model) {
    override val fuelCapacity: Int = 20

    override fun start() {
        println("Мотоцикл $make $model завелся и поехал.")
    }

    override fun stop() {
        println("Мотоцикл $make $model остановился.")
    }
}