package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_B, b: (T_A,T_A), c: Byte) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C(a: CC_B, b: CC_B, c: T_A) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_, (CC_B(_),CC_A(_, _, _)), _) => 1 
  case CC_A(CC_C(_, _, _), (CC_B(_),CC_A(_, _, _)), 0) => 2 
  case CC_A(_, (CC_B(_),CC_A(_, _, _)), 0) => 3 
  case CC_A(_, _, 0) => 4 
  case CC_A(CC_C(_, _, _), _, _) => 5 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A (Tuple (CC_B Wildcard T_A) (CC_C Wildcard T_A)) T_A)