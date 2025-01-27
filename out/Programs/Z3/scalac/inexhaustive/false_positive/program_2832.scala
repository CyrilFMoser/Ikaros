package Program_30 

package Program_10 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, C]) extends T_A[C, T_A[C, C]]

val v_a: T_A[Byte, T_A[Byte, Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A Byte (T_A Byte Byte)))
// This is not matched: (CC_C Char Char (T_B Char Char))