package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[C, T_A[T_B, T_A[T_B, T_B]]]
case class CC_B[D](a: CC_A[D]) extends T_A[D, T_A[T_B, T_A[T_B, T_B]]]
case class CC_C[E](a: T_A[E, E], b: CC_B[E], c: E) extends T_A[E, T_A[T_B, T_A[T_B, T_B]]]

val v_a: T_A[T_B, T_A[T_B, T_A[T_B, T_B]]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_)