package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D]() extends T_A[C]
case class CC_B(a: CC_A[Byte, Char], b: CC_A[Byte, Byte]) extends T_A[T_A[Boolean]]
case class CC_C(a: CC_B, b: CC_B, c: T_B[CC_B]) extends T_B[CC_A[CC_B, CC_B]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Char Boolean (T_A Char))
// This is not matched: (CC_B Boolean Wildcard Wildcard (T_A Boolean (T_A Int Boolean)))