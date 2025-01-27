package Program_31 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C, b: T_A[C, C]) extends T_A[C, T_A[Byte, Byte]]
case class CC_B[D, E](a: Char) extends T_A[D, T_A[Byte, Byte]]

val v_a: T_A[Char, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
  case CC_B(_) => 1 
  case CC_A(_, _) => 2 
}
}
// This is not matched: (CC_B Char Boolean Wildcard (T_A Char (T_A Byte Byte)))
// This is not matched: (CC_C Wildcard Wildcard Wildcard T_B)