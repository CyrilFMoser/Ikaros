package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_A[Boolean]]
case class CC_B[C]() extends T_B[C]
case class CC_C[D](a: T_A[D], b: T_A[D], c: T_B[D]) extends T_B[D]
case class CC_D() extends T_B[CC_C[CC_A]]

val v_a: T_B[CC_D] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, CC_B()) => 1 
}
}
// This is not matched: (CC_B (CC_A Wildcard Wildcard (Tuple Wildcard Wildcard) T_A) Wildcard T_A)