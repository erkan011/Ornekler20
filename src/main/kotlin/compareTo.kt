data class Person(val name: String, val age:Int) : Comparable<Person>{
    override fun compareTo(other: Person): Int {
        return this.age.compareTo(other.age)
    }
}

fun main() {
    val person1 = Person("erkan", 22)
    val person2 = Person("eymen", 7)
    val result = person1.compareTo(person2)
    if (result < 0){
        println("${person1.name} ${person1.age} yaşında ve ${person2.name} ${person2.age} yaşından küçük")
    }else if (result > 0){
        println("${person1.name} ${person1.age} yaşında ve ${person2.name} ${person2.age} yaşından büyük")
    }else{
        println("${person1.name} ${person1.age} yaşında ve ${person2.name} ${person2.age} yaşına eşit")

    }
}