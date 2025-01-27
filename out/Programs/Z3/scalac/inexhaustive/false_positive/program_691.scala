package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[C, D], b: T_A[C, C]) extends T_A[(Char,Int), C]

val v_a: T_A[(Char,Int), Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard (T_A (Tuple Char Int) Char))
// This is not matched: (CC_B Byte Wildcard Wildcard (T_A Int Byte))