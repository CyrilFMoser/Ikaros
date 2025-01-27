package Program_30 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), (T_A,T_A)]) extends T_A
case class CC_B(a: Byte, b: CC_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: Int, b: C, c: CC_B) extends T_B[CC_A, C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, CC_A(_), _)