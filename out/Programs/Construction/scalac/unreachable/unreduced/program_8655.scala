package Program_12 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: Byte) extends T_A[T_A[T_A[C, C], C], C]
case class CC_B[D, E]() extends T_A[CC_A[D], D]
case class CC_C[F](a: Int, b: T_A[F, F], c: Byte) extends T_A[T_A[T_A[F, F], F], F]

val v_a: T_A[T_A[T_A[Char, Char], Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 0) => 0 
  case CC_A(_, _) => 1 
  case CC_C(_, _, 0) => 2 
  case CC_C(_, _, _) => 3 
}
}