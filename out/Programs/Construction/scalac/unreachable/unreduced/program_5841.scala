package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[(Char,Boolean), Int]) extends T_A[(T_A[Char],T_B[Char, Boolean])]
case class CC_B(a: T_B[Boolean, (CC_A,CC_A)]) extends T_A[(T_A[Char],T_B[Char, Boolean])]
case class CC_C() extends T_A[(T_A[Char],T_B[Char, Boolean])]
case class CC_D[D, E](a: T_A[E]) extends T_B[D, E]
case class CC_E[F, G](a: T_B[F, F]) extends T_B[F, G]

val v_a: T_B[CC_A, CC_C] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_D(_)) => 1 
  case CC_E(CC_E(CC_D(_))) => 2 
  case CC_E(CC_E(CC_E(_))) => 3 
}
}