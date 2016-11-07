object Hello {
   def main(args: Array[String]) {
      var i = 10
      val ival = "10"
      var (v1, v2) = Pair(20, 30)
      val (s1, s2, s3) = ("String1", "Stirng 2", "String 3")
      println("Say \"Hello, Scala\" " + i + " times!")
      println("Say \"Hello, Scala\" " + ival + " times!")
      println("v1=" + v1 + "  v2=" + v2)
      println("s1=" + s1 + "  s2=" + s2 + "  s3=" + s3)
      v1=110;  v2=210
      println("Changed v1=" + v1 + "  v2=" + v2)
   }
}