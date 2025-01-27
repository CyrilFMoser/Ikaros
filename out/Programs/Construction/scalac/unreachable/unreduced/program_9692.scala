package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Int, b: T_A[E, E], c: T_B[E, E]) extends T_A[T_B[T_B[Int, Char], T_A[Byte, Int]], E]
case class CC_B[F](a: ((Boolean,(Char,Char)),Boolean), b: T_B[F, F]) extends T_A[T_B[T_B[Int, Char], T_A[Byte, Int]], F]

val v_a: T_A[T_B[T_B[Int, Char], T_A[Byte, Int]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}