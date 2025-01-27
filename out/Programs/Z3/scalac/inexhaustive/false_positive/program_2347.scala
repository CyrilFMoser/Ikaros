package Program_31 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B(a: T_A[T_B]) extends T_B
case class CC_C[C](a: CC_B, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A()) => 0 
  case CC_C(_, _) => 1 
  case CC_C(CC_B(_), 0) => 2 
}
}
// This is not matched: (CC_C T_B Wildcard Byte T_B)
// This is not matched: (CC_B Int Boolean (T_A Int))