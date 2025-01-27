package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B(a: Byte, b: T_B, c: T_A[T_B]) extends T_B
case class CC_C[B]() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_B(_, _, CC_A(_)) => 1 
}
}
// This is not matched: (CC_C T_B T_B)
// This is not matched: Pattern match is empty without constants