fun main(){
    var person = Warrior("Kossym", 49, "President")
    var person2 = Warrior("Kanzhar", 24, "Son Presisent")
    var person3 = Warrior("E", 21, "Voin")
    var person4 = Warrior("A", 20, "Voin")
    var person5 = Warrior("Zh", 18, "Voin")
    println("${person.name}, ${person.age}, ${person.typeWarrior}")
    println("${person2.name}, ${person2.age}, ${person2.typeWarrior}")
    println("${person3.name}, ${person3.age}, ${person3.typeWarrior}")
    println("${person4.name}, ${person4.age}, ${person4.typeWarrior}")
    println("${person5.name}, ${person5.age}, ${person5.typeWarrior}")
}

//TASK-1.1
open class Warrior(val _name: String, val _age: Int, val _typeWarrior: String) {
    var name = _name
    var age = _age
    var typeWarrior = _typeWarrior

    open fun doAttack(name: String) {}
}