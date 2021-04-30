fun sayHello(greeting:String, itemToGreet:String) = println("$greeting $itemToGreet")

fun main() {
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic books")
    println(interestingThings.size)
    
    interestingThings.forEach {interestingThing ->
        println(interestingThing)
    }
}