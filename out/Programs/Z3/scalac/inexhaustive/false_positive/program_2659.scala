package Program_31 

package Program_2 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, E], b: T_A[Char, Char]) extends T_A[D, C]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Boolean Wildcard Wildcard (T_A Char Boolean))
// This is not matched: (CC_A (T_A (T_A Byte Char) Byte))