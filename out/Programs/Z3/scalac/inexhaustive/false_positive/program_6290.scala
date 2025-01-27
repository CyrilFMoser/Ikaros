package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: T_A[D]) extends T_A[D]
case class CC_B[F]() extends T_A[F]

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B()) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      (CC_B Boolean (T_A Boolean))
//      (T_A Boolean))