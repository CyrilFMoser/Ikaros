package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[Boolean, T_B]
case class CC_B(a: Int, b: T_A[Boolean, T_B]) extends T_A[Boolean, T_B]
case class CC_C(a: CC_B, b: T_A[T_A[CC_B, Char], T_A[Boolean, T_B]]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_B(_, _)), _) => 0 
}
}
// This is not matched: CC_B()