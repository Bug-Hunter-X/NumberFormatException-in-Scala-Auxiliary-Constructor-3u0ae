```scala
class AnotherClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println("Invalid input string: "+ s)
        this(0) // Default value or alternative handling
    }
  }
}

val anotherInstance = new AnotherClass("abc")
println(anotherInstance.x) // Output: 0 (or handles the exception)

val anotherInstance2 = new AnotherClass("123")
println(anotherInstance2.x) // Output: 123
```