package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_A[T_B, C], b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_A[T_A[Char, T_B], T_B], b: T_A[CC_A[T_B], T_A[CC_A[T_B], CC_A[T_B]]]) extends T_B
case class CC_C() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, CC_C())) => 0 
}
}
// This is not matched: CC_A()