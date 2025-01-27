package Program_30 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: B) extends T_A[B]
case class CC_B(a: T_A[Int], b: CC_A[Byte, T_B], c: Char) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_), _, _) => 0 
}
}
// This is not matched: (CC_B (CC_A Int T_B Wildcard (T_A Int)) Wildcard Wildcard T_B)
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_A)