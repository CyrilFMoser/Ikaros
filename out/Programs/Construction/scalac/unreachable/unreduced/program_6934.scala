package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_A[T_A[Int, Int], T_B[Int, Byte]], E]
case class CC_B[F](a: T_A[T_A[Char, F], F], b: Boolean, c: CC_A[F]) extends T_A[T_A[T_A[Int, Int], T_B[Int, Byte]], F]
case class CC_C[G](a: T_B[T_B[G, G], G]) extends T_A[T_A[T_A[Int, Int], T_B[Int, Byte]], G]

val v_a: T_A[T_A[T_A[Int, Int], T_B[Int, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)