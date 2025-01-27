package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: Byte, c: T_B[Char, T_A]) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C[C](a: Byte, b: CC_B) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}