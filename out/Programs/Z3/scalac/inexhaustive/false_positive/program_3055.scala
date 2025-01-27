package Program_15 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[(Byte,T_B)]
case class CC_B() extends T_A[(Byte,T_B)]
case class CC_C(a: CC_A[CC_B], b: T_A[Byte]) extends T_B

val v_a: T_A[(Byte,T_B)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
}
}
// This is not matched: (CC_A T_B (T_A (Tuple Byte T_B)))
// This is not matched: (CC_B T_A)