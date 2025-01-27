package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[C, C], C]
case class CC_B[D](a: T_A[T_A[D, D], D], b: D, c: T_A[T_A[D, D], D]) extends T_A[T_A[D, D], D]
case class CC_C[E](a: CC_B[E], b: T_A[E, E], c: T_A[E, E]) extends T_A[T_A[E, E], E]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
  case CC_C(CC_B(_, _, _), _, _) => 2 
}
}