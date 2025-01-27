package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: (T_B[Char, Char],T_A[Int])) extends T_A[D]
case class CC_B[E](a: Int, b: E) extends T_A[E]
case class CC_C[F](a: Char, b: F, c: T_A[F]) extends T_B[T_A[F], F]
case class CC_D[G](a: (CC_B[Boolean],T_B[Byte, Byte])) extends T_B[T_A[G], G]
case class CC_E() extends T_B[T_A[Boolean], Boolean]

val v_a: T_B[T_A[Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _, _) => 0 
  case CC_D((CC_B(_, _),_)) => 1 
}
}
// This is not matched: CC_E()