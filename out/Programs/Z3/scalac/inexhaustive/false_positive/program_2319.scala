package Program_31 

package Program_4 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,T_A), b: Char) extends T_A
case class CC_B[A](a: CC_A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A((CC_B(_, _),CC_B(_, _)), 'x') => 0 
  case CC_A(_, _) => 1 
  case CC_A((CC_B(_, _),CC_A(_, _)), _) => 2 
  case CC_A((CC_A(_, _),CC_B(_, _)), 'x') => 3 
  case CC_A((CC_B(_, _),CC_A(_, _)), 'x') => 4 
  case CC_A(_, 'x') => 5 
  case CC_A((CC_A(_, _),CC_A(_, _)), _) => 6 
  case CC_A((CC_A(_, _),CC_A(_, _)), 'x') => 7 
  case CC_B(CC_A(_, _), _) => 8 
  case CC_B(_, _) => 9 
}
}
// This is not matched: (CC_B T_A Wildcard Wildcard T_A)
// This is not matched: Pattern match is empty without constants