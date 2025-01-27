package Program_29 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, E]) extends T_A[D, C]

val v_a: T_A[Byte, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Char Byte Boolean Wildcard (T_A Byte Char))
// This is not matched: (CC_A (CC_A (CC_B T_A) T_A) T_A)