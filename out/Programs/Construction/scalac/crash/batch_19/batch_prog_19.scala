package Program_19 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C](a: T_A[C, D], b: T_A[C, C]) extends T_A[C, D]
case class CC_B[E]() extends T_A[E, T_A[T_A[Int, Char], (Boolean,Int)]]
case class CC_C[F](a: F, b: T_A[F, F]) extends T_A[F, T_A[T_A[Int, Char], (Boolean,Int)]]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}