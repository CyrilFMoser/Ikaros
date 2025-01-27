package Program_15 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: T_A[C]) extends T_A[C]

val v_a: CC_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_)) => 0 
}
}
// This is not matched: (CC_D (CC_B Boolean Wildcard Boolean T_A)
//      (CC_B Wildcard Char Wildcard T_A)
//      (T_B (CC_B Boolean Wildcard Boolean T_A) Char))