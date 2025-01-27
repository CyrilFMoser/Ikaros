package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A() extends T_A[T_B[Boolean, Byte]]
case class CC_D[D]() extends T_B[CC_A, D]
case class CC_E[F](a: T_B[F, F]) extends T_B[CC_A, F]

val v_a: CC_E[CC_A] = null
val v_b: Int = v_a match{
  case CC_E(CC_D()) => 0 
}
}
// This is not matched: (CC_A Wildcard Wildcard T_A)