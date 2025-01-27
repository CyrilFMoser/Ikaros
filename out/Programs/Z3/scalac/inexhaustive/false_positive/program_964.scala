package Program_28 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B, b: T_B) extends T_A[B]
case class CC_B[C]() extends T_A[C]
case class CC_C() extends T_B
case class CC_D[D]() extends T_B
case class CC_E() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E() => 2 
}
}
// This is not matched: (CC_D T_B T_B)
// This is not matched: (CC_A (CC_B T_A) Wildcard Wildcard T_A)