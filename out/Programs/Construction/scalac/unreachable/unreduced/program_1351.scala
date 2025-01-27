package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: Byte) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: T_A[D, T_A[D, D]], c: D) extends T_A[D, T_A[D, D]]
case class CC_C[E](a: T_A[CC_A[E], T_A[CC_A[E], CC_A[E]]], b: T_A[E, E], c: E) extends T_A[E, T_A[E, E]]

val v_a: T_A[Boolean, T_A[Boolean, Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_A(_, _), _, _) => 2 
  case CC_C(CC_C(_, _, _), _, _) => 3 
}
}
// This is not matched: CC_C(CC_B(_, _, _), _, _)