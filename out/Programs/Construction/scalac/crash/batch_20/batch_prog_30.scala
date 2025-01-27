package Program_30 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: Int, b: T_A[C, D]) extends T_A[D, C]
case class CC_B[E](a: CC_A[E, E], b: T_A[E, E]) extends T_A[T_A[T_A[Char, Boolean], T_A[Int, Byte]], E]
case class CC_C[F]() extends T_A[T_A[T_A[Char, Boolean], T_A[Int, Byte]], F]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}