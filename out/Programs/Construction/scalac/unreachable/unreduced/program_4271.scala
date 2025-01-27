package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[T_A[E, T_B[E, E]], E]
case class CC_B[F, G](a: Int, b: T_B[F, G], c: (CC_A[Int],CC_A[Int])) extends T_A[T_A[F, T_B[F, F]], F]

val v_a: T_A[T_A[Char, T_B[Char, Char]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}