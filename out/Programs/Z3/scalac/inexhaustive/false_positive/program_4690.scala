package Program_15 

package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C]() extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: CC_B[T_B], b: T_A[T_B], c: T_A[T_B]) extends T_B
case class CC_D(a: T_A[CC_C], b: (T_B,CC_C)) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(), CC_A(), CC_A()) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_B T_B (T_A T_B)) Wildcard T_B)
// This is not matched: Pattern match is empty without constants