package Program_12 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: Int) extends T_A[B]
case class CC_B(a: CC_A[Boolean, Int], b: T_A[(Byte,Char)]) extends T_A[T_A[Char]]
case class CC_C(a: T_A[CC_B], b: T_A[(Char,Char)], c: Int) extends T_A[T_A[Char]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B Wildcard (CC_B Wildcard Wildcard Wildcard T_A) Wildcard T_A)