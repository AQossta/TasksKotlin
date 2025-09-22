// Интерфейс с действиями воина
interface WarriorAction {
    fun doAttack(name: String)
    fun sayAboutOwn(name: String)
    fun doDied(name: String)
}

// Базовый класс воин
open class Warrior9(
    val name: String,
    val age: Int
) : WarriorAction {
    override fun doAttack(name: String) {
        println("$name атакует!")
    }

    override fun sayAboutOwn(name: String) {
        println("Я воин $name, мне $age лет.")
    }

    override fun doDied(name: String) {
        println("$name пал в бою...")
    }
}

// Рыцарь
class Knight(name: String, age: Int) : Warrior9(name, age) {
    override fun doAttack(name: String) {
        println("Рыцарь $name атакует мечом!")
    }

    override fun sayAboutOwn(name: String) {
        println("Я рыцарь $name, моя сила — честь и доблесть.")
    }

    override fun doDied(name: String) {
        println("Рыцарь $name погиб, защищая королевство.")
    }
}

// Лучник
class Archer(name: String, age: Int) : Warrior9(name, age) {
    override fun doAttack(name: String) {
        println("Лучник $name выпускает стрелу!")
    }

    override fun sayAboutOwn(name: String) {
        println("Я лучник $name, меткий стрелок и разведчик.")
    }

    override fun doDied(name: String) {
        println("Лучник $name пал от руки врага.")
    }
}

// Пример использования
fun main() {
    val knight = Knight("Kossym", 49)
    val archer = Archer("Kanzhar", 21)

    knight.sayAboutOwn(knight.name)
    knight.doAttack(knight.name)
    knight.doDied(knight.name)

    println()

    archer.sayAboutOwn(archer.name)
    archer.doAttack(archer.name)
    archer.doDied(archer.name)
}
