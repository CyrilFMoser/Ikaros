package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Byte) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], C]
case class CC_B[D](a: T_A[D, D], b: D, c: CC_A[D]) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], D]
case class CC_C[E](a: T_A[E, E], b: T_A[E, E], c: T_A[T_A[E, E], E]) extends T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], E]

val v_a: T_A[T_A[T_A[Byte, Char], T_A[Byte, Byte]], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_B(_, _, _)