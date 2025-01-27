package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B, C](a: T_A[C], b: C, c: Char) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
  case CC_A(CC_A(_, _, _), _, 'x') => 1 
}
}
// This is not matched: (CC_A Char T_B Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: Pattern match is empty without constants