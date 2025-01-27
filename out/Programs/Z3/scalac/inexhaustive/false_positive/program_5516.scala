package Program_14 

package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B]() extends T_A[B]
case class CC_B[C](a: Int, b: C, c: C) extends T_B
case class CC_C(a: Boolean, b: T_A[T_B], c: CC_B[T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, _) => 1 
  case CC_C(_, CC_A(), _) => 2 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: Pattern match is empty without constants