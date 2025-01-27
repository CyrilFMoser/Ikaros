package Program_26 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[(T_A[Int, Char],T_A[Int, Boolean]), D]
case class CC_B[E](a: Byte, b: Int, c: T_A[T_B[E], E]) extends T_A[(T_A[Int, Char],T_A[Int, Boolean]), E]
case class CC_C[F](a: T_A[F, F], b: CC_B[F], c: T_B[F]) extends T_A[(T_A[Int, Char],T_A[Int, Boolean]), F]

val v_a: T_A[(T_A[Int, Char],T_A[Int, Boolean]), Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(0, _, _) => 1 
  case CC_B(_, _, _) => 2 
  case CC_C(_, _, _) => 3 
}
}