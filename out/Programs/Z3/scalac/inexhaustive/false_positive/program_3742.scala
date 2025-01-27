package Program_12 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[B], b: T_A[B], c: Char) extends T_A[B]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, 'x') => 0 
  case CC_A(_, CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_A Char Boolean Wildcard Wildcard Wildcard (T_A Char))
// This is not matched: (CC_D Char Wildcard Wildcard (T_B Char))