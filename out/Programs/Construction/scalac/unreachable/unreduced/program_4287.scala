package Program_12 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: T_A[E, E], c: Char) extends T_A[T_A[E, T_A[E, E]], E]
case class CC_B[F](a: Byte, b: T_B[F, F]) extends T_A[T_A[F, T_A[F, F]], F]
case class CC_C[G]() extends T_A[T_A[G, T_A[G, G]], G]

val v_a: T_A[T_A[Int, T_A[Int, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C() => 2 
}
}