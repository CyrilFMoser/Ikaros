package Program_13 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A() extends T_A[T_B]
case class CC_B[B](a: B) extends T_B
case class CC_C(a: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(CC_C(_)) => 1 
  case CC_C(CC_B(_)) => 2 
}
}
// This is not matched: (CC_C (CC_B T_B Wildcard T_B) T_B)
// This is not matched: (CC_C (CC_B T_B Wildcard T_B) T_B)