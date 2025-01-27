package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: T_A[D, D]) extends T_A[(T_A[Boolean, Char],T_B[Int]), D]
case class CC_B[E](a: T_B[E], b: T_B[Boolean], c: Byte) extends T_A[(T_A[Boolean, Char],T_B[Int]), E]
case class CC_C[F]() extends T_A[F, CC_B[F]]
case class CC_D[G](a: CC_C[G]) extends T_B[G]
case class CC_E[H](a: T_A[T_A[H, H], H], b: H, c: (Boolean,T_A[Boolean, Char])) extends T_B[H]

val v_a: T_A[(T_A[Boolean, Char],T_B[Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(CC_C()), _) => 0 
  case CC_A(CC_E(_, _, _), _) => 1 
  case CC_B(_, _, _) => 2 
}
}