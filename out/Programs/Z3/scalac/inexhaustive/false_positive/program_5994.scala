package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[C, Boolean]
case class CC_C[E](a: T_A[E, E], b: CC_A[E], c: T_A[E, Boolean]) extends T_A[E, Boolean]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _, CC_C(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Wildcard T_A)