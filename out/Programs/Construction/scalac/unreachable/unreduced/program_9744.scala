package Program_24 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: Char, b: Boolean) extends T_A[T_A[(Int,Byte), T_A[Char, Byte]], C]
case class CC_B[D, E]() extends T_A[CC_A[T_A[Int, Char]], D]
case class CC_C[F](a: T_A[F, F], b: CC_B[F, F], c: CC_A[F]) extends T_A[T_A[(Int,Byte), T_A[Char, Byte]], F]

val v_a: T_A[T_A[(Int,Byte), T_A[Char, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A('x', _) => 0 
  case CC_C(_, _, _) => 1 
}
}
// This is not matched: CC_A(_, _)