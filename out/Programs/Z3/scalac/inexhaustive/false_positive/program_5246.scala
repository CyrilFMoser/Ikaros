package Program_14 

package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: T_A[D, D]) extends T_A[D, C]
case class CC_B[E](a: CC_A[E, E], b: E) extends T_B
case class CC_C(a: T_A[T_B, Char], b: Int, c: T_A[(Int,Byte), T_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, 12, _) => 1 
  case CC_C(CC_A(_), _, _) => 2 
  case CC_C(CC_A(_), _, CC_A(_)) => 3 
  case CC_C(_, 12, CC_A(_)) => 4 
  case CC_C(_, _, CC_A(_)) => 5 
}
}
// This is not matched: (CC_B T_B Wildcard Wildcard T_B)
// This is not matched: Pattern match is empty without constants