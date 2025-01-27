package Program_14 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A](a: A) extends T_A
case class CC_B(a: T_A, b: Byte, c: CC_A[(Byte,Char)]) extends T_A
case class CC_C(a: CC_A[T_A], b: (CC_B,CC_B), c: Char) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_C(_, _, _), 0, CC_A(_)) => 1 
  case CC_B(CC_A(_), _, CC_A(_)) => 2 
  case CC_B(_, 0, _) => 3 
  case CC_B(CC_C(_, _, _), _, CC_A(_)) => 4 
  case CC_B(CC_A(_), _, _) => 5 
  case CC_B(CC_B(_, _, _), 0, _) => 6 
  case CC_B(CC_A(_), 0, CC_A(_)) => 7 
  case CC_B(CC_B(_, _, _), _, _) => 8 
  case CC_B(CC_B(_, _, _), _, CC_A(_)) => 9 
  case CC_B(CC_C(_, _, _), _, _) => 10 
  case CC_B(_, _, _) => 11 
  case CC_C(_, (CC_B(_, _, _),CC_B(_, _, _)), 'x') => 12 
  case CC_C(CC_A(_), _, _) => 13 
  case CC_C(CC_A(_), _, 'x') => 14 
}
}
// This is not matched: (CC_A T_A Wildcard T_A)
// This is not matched: Pattern match is empty without constants