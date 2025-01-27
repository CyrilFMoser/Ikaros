package Program_31 

package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: Byte, b: Char, c: Int) extends T_A[D, C]

val v_a: T_A[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_A(0, 'x', 12) => 0 
  case CC_A(0, _, 12) => 1 
  case CC_A(_, _, _) => 2 
}
}
// This is not matched: (CC_A Boolean Char Boolean Wildcard Wildcard Wildcard (T_A Boolean Char))
// This is not matched: Pattern match is empty without constants