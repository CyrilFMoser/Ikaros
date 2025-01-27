package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, Byte], c: T_A[E, Byte]) extends T_A[E, Byte]
case class CC_B[F](a: F, b: F, c: T_A[F, T_A[F, F]]) extends T_B[CC_A[T_A[Byte, Char]], F]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}