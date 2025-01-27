package Program_3 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[T_A[Byte, (Boolean,Int)], T_A[Boolean, Boolean]]]
case class CC_B[D](a: D, b: CC_A[D]) extends T_A[Char, D]
case class CC_C[E](a: T_A[Boolean, E], b: E, c: E) extends T_A[Char, E]

val v_a: T_A[Char, T_A[T_A[Byte, (Boolean,Int)], T_A[Boolean, Boolean]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}
// This is not matched: CC_C(_, _, _)