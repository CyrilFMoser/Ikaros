package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Boolean], b: T_A[Char], c: Char) extends T_A[T_A[Char]]
case class CC_B[B, C](a: T_A[B]) extends T_A[B]
case class CC_C(a: Char) extends T_A[T_A[Char]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B Byte
//      Boolean
//      (CC_B Byte Boolean (CC_B Byte Boolean Wildcard (T_A Byte)) (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_C Wildcard T_A)