package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C[B](a: T_B, b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_C(_, _), _) => 1 
  case CC_C(CC_B(), CC_B()) => 2 
  case CC_C(CC_B(), _) => 3 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)