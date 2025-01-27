package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[Char]) extends T_A
case class CC_B(a: CC_A, b: (CC_A,T_A)) extends T_A
case class CC_C(a: T_B[T_A], b: CC_A, c: Boolean) extends T_A
case class CC_D(a: CC_C) extends T_B[CC_C]
case class CC_E[B](a: T_B[CC_C]) extends T_B[CC_C]

val v_a: T_B[CC_C] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _, _)) => 0 
  case CC_E(CC_D(_)) => 1 
  case CC_E(CC_E(CC_D(_))) => 2 
}
}
// This is not matched: CC_E(CC_E(CC_E(_)))