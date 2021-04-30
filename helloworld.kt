fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    val interestingThings = mutableListOf("Kotlin", "Programming", "Comic books")
    interestingThings.add("Dogs")
    interestingThings.forEach { println(it) }

    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
    map.put(4, "d")
    map.forEach { key, value -> println("$key -> $value") }
}