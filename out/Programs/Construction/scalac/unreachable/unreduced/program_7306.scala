package Program_31 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, (Char,Int)], T_A[Int, Boolean]], C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[T_A[Char, (Char,Int)], T_A[Int, Boolean]], D]
case class CC_C[E](a: CC_B[E], b: E, c: CC_B[E]) extends T_A[T_A[T_A[Char, (Char,Int)], T_A[Int, Boolean]], E]

val v_a: T_A[T_A[T_A[Char, (Char,Int)], T_A[Int, Boolean]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}