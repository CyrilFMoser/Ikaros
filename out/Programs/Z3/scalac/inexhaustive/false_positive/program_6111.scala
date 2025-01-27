package Program_13 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char, b: Boolean, c: (T_B,T_B)) extends T_A[T_B]
case class CC_B[B](a: B) extends T_B
case class CC_C(a: CC_A, b: Boolean, c: Boolean) extends T_B
case class CC_D(a: CC_A, b: T_A[(Byte,Char)]) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_B(_),CC_B(_))) => 0 
  case CC_A('x', _, (CC_B(_),CC_C(_, _, _))) => 1 
}
}
// This is not matched: (CC_A Char
//      Boolean
//      (Tuple (CC_B Wildcard Boolean T_B) (CC_C Wildcard Wildcard Wildcard T_B))
//      (T_A T_B))
// This is not matched: (CC_B Byte Boolean (T_B (CC_A Boolean Boolean) Byte))