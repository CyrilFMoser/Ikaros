package Program_15 

package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: T_B[B], b: B, c: T_A) extends T_A
case class CC_B[C](a: CC_A[C], b: C, c: T_B[C]) extends T_B[C]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_A(CC_B(_, _, _), _, CC_A(_, _, _)) => 1 
  case CC_A(_, _, CC_A(_, _, _)) => 2 
}
}
// This is not matched: (CC_A Boolean Wildcard Boolean Wildcard T_A)
// This is not matched: (CC_B (Tuple (CC_C Wildcard Wildcard Int T_A) (CC_B Wildcard T_A)) T_A)