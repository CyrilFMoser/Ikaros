package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: D, b: T_A[D, D]) extends T_A[D, E]
case class CC_C[G]() extends T_A[T_B[Byte], G]
case class CC_D() extends T_B[CC_C[Char]]

val v_a: T_A[T_B[Byte], Char] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A(_, CC_A(_, _)) => 1 
}
}
// This is not matched: (CC_A Boolean Wildcard Wildcard Wildcard (T_A Boolean))