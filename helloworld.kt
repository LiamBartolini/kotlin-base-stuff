fun getGreeting(): String {
    return "Hello Kotlin"
}

// Unit -> same as saying 'this return nothing useful'
// Or no return value, is the same thing
fun sayHello(){
    println(getGreeting())
}

fun main() {
    println("Hello world")
    sayHello()
}