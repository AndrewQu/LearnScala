object Hello {
   def main(args: Array[String]) {
      printHellos

      def printHellos {
         println("Hello 1")
         println("Hello 2")
         println("Hello 3")
      }
      var i = 10
      val ival = "10"
      var (v1, v2) = (20, 30)
      val (s1, s2, s3) = ("String1", "Stirng 2", "String 3")
      println("Say \"Hello, Scala\" " + i + " times!")
      println("Say \"Hello, Scala\" " + ival + " times!")
      println("v1=" + v1 + "  v2=" + v2)
      println("s1=" + s1 + "  s2=" + s2 + "  s3=" + s3)
      v1=110;  v2=210
      println("Changed v1=" + v1 + "  v2=" + v2)

      var p1 = new Point2d(10,20)
      println("p1.x=" + p1.x + "  p1.y=" + p1.y)
      p1.transplate(5, 5)
      println("Moved by (5,5) p1.x=" + p1.x + "  p1.y=" + p1.y)

      var p3 = new Point3d(110, 120, 130)
      println("p3.x=" + p3.x + "  p3.y=" + p3.y + "  p3.z=" + p3.z)
      p3.transplate(5, 5)
      println("p3 Moved by (5,5) p3.x=" + p3.x + "  p3.y=" + p3.y)     
      
   }

}

class Point2d(_x: Int, _y: Int) {
   var x: Int = _x
   var y: Int = _y

   def transplate(dx: Int, dy: Int) {
      x += dx;  y += dy
   }
}

class Point3d(xc: Int, yc: Int, zc: Int) extends Point2d(xc, yc) {
   var z = zc
   def move(dx: Int, dy: Int, dz: Int) {
      x += dx;   y += dy
      z += zc
   }
}
