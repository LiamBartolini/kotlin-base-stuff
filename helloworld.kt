fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic books")
    println(interestingThings.size)

    for (interestingThing in interestingThings) {
        println(interestingThing)
    }
}