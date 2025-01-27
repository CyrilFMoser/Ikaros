package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[(Int,Boolean), E], b: Char, c: T_B[E, E]) extends T_A[T_A[T_B[Int, Boolean], Byte], E]
case class CC_B[F](a: CC_A[F], b: F) extends T_A[T_A[T_B[Int, Boolean], Byte], F]
case class CC_C[G](a: G) extends T_B[Byte, G]

val v_a: T_A[T_A[T_B[Int, Boolean], Byte], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _) => 1 
}
}