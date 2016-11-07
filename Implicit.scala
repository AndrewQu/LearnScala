object Implicit {
   implicit class LoopCounter(x: Int) {
      def times [A](f: =>A) {
         def loop(current: Int) {
            if(current > 0) {
               f
               loop(current - 1)
            }
         }
         loop(x)
      }
   }
}