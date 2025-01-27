package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E], c: T_A[Char, E]) extends T_A[T_A[T_B[Int, Byte], T_A[Int, Byte]], E]
case class CC_B[F](a: F) extends T_A[T_A[T_B[Int, Byte], T_A[Int, Byte]], F]

val v_a: T_A[T_A[T_B[Int, Byte], T_A[Int, Byte]], Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_) => 1 
}
}