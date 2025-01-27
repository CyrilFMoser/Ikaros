package Program_31 

package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[D, C, E](a: Char) extends T_A[D, C]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A('x') => 1 
}
}
// This is not matched: (CC_A Char Boolean T_B Wildcard (T_A Char Boolean))
// This is not matched: (CC_A Wildcard Wildcard T_A)