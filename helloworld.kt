// vararg = a variable number of arguments
fun sayHello(greeting:String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { item ->
        println("$greeting $item")
    }
}

fun greetPerson(greeting:String, name:String) = println("$greeting $name")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic books")
    sayHello(greeting = "Hi", itemsToGreet = *interestingThings)
}