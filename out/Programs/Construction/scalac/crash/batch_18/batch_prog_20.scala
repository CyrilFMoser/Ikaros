package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B[C, D](a: Char, b: CC_A, c: T_A) extends T_B[C, D]
case class CC_C(a: CC_B[Int, CC_B[Byte, CC_A]]) extends T_B[CC_A, CC_B[(CC_A,T_A), T_B[CC_A, (Char,Byte)]]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}