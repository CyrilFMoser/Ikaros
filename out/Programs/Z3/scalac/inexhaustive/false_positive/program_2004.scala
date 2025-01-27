package Program_31 

package Program_9 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,T_A), b: Int, c: Int) extends T_A
case class CC_B[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, _) => 1 
  case CC_A(_, _, _) => 2 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), 12, _) => 3 
  case CC_A((CC_B(),CC_B()), 12, 12) => 4 
  case CC_A(_, 12, 12) => 5 
  case CC_A((CC_A(_, _, _),CC_A(_, _, _)), _, 12) => 6 
  case CC_A((CC_B(),CC_A(_, _, _)), _, 12) => 7 
  case CC_A((CC_A(_, _, _),CC_B()), 12, _) => 8 
  case CC_A((CC_B(),CC_B()), _, _) => 9 
  case CC_A((CC_B(),CC_B()), _, 12) => 10 
  case CC_A((CC_B(),CC_A(_, _, _)), 12, _) => 11 
  case CC_A((CC_B(),CC_A(_, _, _)), 12, 12) => 12 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_F Wildcard T_B)