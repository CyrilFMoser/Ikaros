package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Byte, c: T_A[D]) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C() extends T_A[T_A[CC_B[Byte]]]
case class CC_D[F](a: Char, b: Char) extends T_B[F, T_A[F]]
case class CC_E[G]() extends T_B[T_A[T_B[CC_C, Int]], G]
case class CC_F[H](a: H, b: H) extends T_B[Int, H]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, CC_B())) => 0 
  case CC_A(_, _, CC_B()) => 1 
  case CC_B() => 2 
}
}
// This is not matched: CC_A(_, _, CC_A(_, _, CC_A(_, _, _)))