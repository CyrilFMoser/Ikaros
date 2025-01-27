package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C]() extends T_A[T_A[T_A[Int, Char], T_A[Char, Char]], C]
case class CC_B[D]() extends T_A[T_A[T_A[Int, Char], T_A[Char, Char]], D]
case class CC_C[E](a: T_A[E, E]) extends T_A[T_A[T_A[Int, Char], T_A[Char, Char]], E]

val v_a: T_A[T_A[T_A[Int, Char], T_A[Char, Char]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B()