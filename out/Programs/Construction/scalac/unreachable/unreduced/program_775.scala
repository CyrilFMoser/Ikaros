package Program_8 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B() extends T_B[Int, Byte]
case class CC_C(a: T_B[(CC_B,CC_A), T_B[Int, Byte]], b: CC_B) extends T_B[Int, Byte]
case class CC_D(a: CC_A, b: Char) extends T_B[Int, Byte]

val v_a: T_B[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_B()) => 1 
  case CC_D(CC_A(), _) => 2 
}
}