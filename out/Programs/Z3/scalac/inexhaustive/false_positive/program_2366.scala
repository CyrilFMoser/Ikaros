package Program_31 

package Program_4 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Byte]
case class CC_B[B]() extends T_A[Byte]
case class CC_C(a: (CC_A,CC_A), b: CC_B[CC_A]) extends T_A[Byte]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B() => 1 
  case CC_C(_, _) => 2 
  case CC_C((CC_A(),CC_A()), _) => 3 
}
}
// This is not matched: (CC_B Boolean (T_A Byte))
// This is not matched: (CC_B Wildcard T_A)