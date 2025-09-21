fun main(){
    var person1 = Warrior2("Kossym", )
    var person2 = Warrior2("Kanzhar")
    var person3 = Warrior2("E")
    var person4 = Warrior2("A")
    var person5 = Warrior2("Zh")
    println("${person1.name1}, ${person1.age1}, ${person1.typeWarrior1}")
    println("${person2.name1}, ${person2.age1}, ${person2.typeWarrior1}")
    println("${person3.name1}, ${person3.age1}, ${person3.typeWarrior1}")
    println("${person4.name1}, ${person4.age1}, ${person4.typeWarrior1}")
    println("${person5.name1}, ${person5.age1}, ${person5.typeWarrior1}")
}

//TASK-1.2
class Warrior2 {
    var name1: String
    var age1: Int
    var typeWarrior1: String

    constructor(name1: String){
        this.name1 = name1
        this.age1 = 0
        this.typeWarrior1 = "Voin"
    }
}