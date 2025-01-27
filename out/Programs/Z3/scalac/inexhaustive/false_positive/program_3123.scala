package Program_13 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: B, c: T_A) extends T_A
case class CC_B[C](a: CC_A[C], b: C, c: T_B[C]) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B (Tuple (CC_C Wildcard Wildcard Int T_A) (CC_B Wildcard T_A)) T_A)