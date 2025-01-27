package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_B() extends T_A[T_B[Boolean], T_B[Char]]
case class CC_D[F]() extends T_B[F]
case class CC_E(a: T_B[CC_B]) extends T_B[CC_B]

val v_a: CC_E = null
val v_b: Int = v_a match{
  case CC_E(CC_E(_)) => 0 
}
}
// This is not matched: (CC_A (CC_A Wildcard Wildcard Wildcard T_A)
//      (CC_A Wildcard Wildcard Wildcard T_A)
//      (CC_B Wildcard T_A)
//      T_A)