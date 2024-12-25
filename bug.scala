```scala
class MyClass(val x: Int) {
  def this() = this(0) // Auxiliary constructor
}

val myInstance = new MyClass()
println(myInstance.x) // Output: 0

class AnotherClass(val x: Int) {
  def this(s: String) = this(s.toInt) // Error-prone auxiliary constructor
}

val anotherInstance = new AnotherClass("abc")
//println(anotherInstance.x) // This line will cause a NumberFormatException because "abc" cannot be converted to an Int
```