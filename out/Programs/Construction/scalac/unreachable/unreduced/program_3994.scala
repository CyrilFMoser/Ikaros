package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A() extends T_A[T_A[(T_B,T_B), Char], T_B]
case class CC_B() extends T_A[T_A[(T_B,T_B), Char], T_B]
case class CC_C(a: T_A[T_A[CC_B, CC_A], CC_B], b: T_A[T_B, Boolean]) extends T_A[T_A[(T_B,T_B), Char], T_B]
case class CC_D() extends T_B

val v_a: T_A[T_A[(T_B,T_B), Char], T_B] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()