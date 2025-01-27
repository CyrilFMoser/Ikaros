package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E]() extends T_A[D, E]
case class CC_B[F](a: T_A[F, F], b: T_A[T_B[F], F]) extends T_A[CC_A[T_A[Byte, Boolean], Char], F]
case class CC_C[G](a: T_A[G, G], b: CC_B[G], c: T_A[G, G]) extends T_A[CC_A[T_A[Byte, Boolean], Char], G]
case class CC_D(a: T_B[T_A[Boolean, Int]]) extends T_B[CC_B[Char]]
case class CC_E() extends T_B[CC_B[Char]]

val v_a: T_B[CC_B[Char]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E() => 1 
}
}