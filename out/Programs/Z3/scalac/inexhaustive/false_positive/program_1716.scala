package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: T_A) extends T_A
case class CC_B(a: Char, b: T_A, c: Int) extends T_A
case class CC_C[D](a: T_B[D, D], b: CC_B, c: Byte) extends T_B[CC_A[D], D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B (Tuple (CC_B Wildcard Wildcard Wildcard T_B) Byte) Wildcard Wildcard T_B)