fun main() {
    val numbers = listOf(1,2,3,4,5,6,7,8,9)
    val countGreaterThanFive = numbers.count {it > 7}
    println("5'ten büyük olan sayıların sayısı: $countGreaterThanFive")
}