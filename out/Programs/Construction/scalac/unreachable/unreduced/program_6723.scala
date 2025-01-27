package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Char], b: T_B[Char]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_A, b: Boolean, c: Byte) extends T_B[CC_A]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _, _) => 0 
  case CC_C(CC_B(), _, _) => 1 
}
}