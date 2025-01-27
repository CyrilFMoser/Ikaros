package Program_17 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[T_A[T_A[Char, Int], T_A[Int, Byte]], C]
case class CC_B[D](a: D, b: T_A[D, D]) extends T_A[T_A[T_A[Char, Int], T_A[Int, Byte]], D]
case class CC_C[E](a: E, b: CC_B[E], c: Int) extends T_A[T_A[T_A[Char, Int], T_A[Int, Byte]], E]

val v_a: T_A[T_A[T_A[Char, Int], T_A[Int, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, 12) => 2 
  case CC_C(_, _, _) => 3 
}
}