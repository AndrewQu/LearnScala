import Implicit._

object CallImplicit {
   def main(args: Array[String]) {
      // Method call without creating an instance
      4 times {
         println("Hello implicit calls.")
         println("Line 2 - Hello calls")
      }
      
      // You cam also create an instance and call the methods.
      var imp = new LoopCounter(3)
      imp.times(println("Hello 3"))
   }
}