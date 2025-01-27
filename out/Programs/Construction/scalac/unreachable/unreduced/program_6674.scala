package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[(Byte,Int), D], b: T_B[T_A[Int, D]], c: T_A[D, D]) extends T_A[(T_B[Byte],T_B[Char]), D]
case class CC_B[E](a: CC_A[E], b: CC_A[E], c: E) extends T_A[(T_B[Byte],T_B[Char]), E]
case class CC_C[F](a: T_B[F], b: Int, c: CC_A[F]) extends T_B[F]

val v_a: T_A[(T_B[Byte],T_B[Char]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(_, _, true) => 1 
  case CC_B(_, _, false) => 2 
}
}