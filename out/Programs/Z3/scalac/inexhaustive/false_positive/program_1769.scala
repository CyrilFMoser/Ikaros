package Program_30 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Byte) extends T_A[T_B]
case class CC_B(a: T_A[T_B], b: Byte) extends T_B
case class CC_C(a: T_A[T_B], b: T_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(CC_A(_), _) => 1 
}
}
// This is not matched: (CC_C (CC_A T_B Byte (T_A T_B)) Wildcard T_B)
// This is not matched: (CC_A (T_A (T_A (Tuple Int Char))))