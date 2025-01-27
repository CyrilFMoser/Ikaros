package Program_31 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: B) extends T_A[B]
case class CC_B(a: T_A[Int], b: CC_A[Byte, T_B], c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), CC_A(_), _) => 0 
  case CC_B(CC_A(_), CC_A(_), 'x') => 1 
}
}
// This is not matched: (CC_B (CC_A Int T_B Int (T_A Int)) Wildcard Wildcard T_B)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)