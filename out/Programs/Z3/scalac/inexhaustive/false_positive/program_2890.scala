package Program_15 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_A, b: A, c: Char) extends T_A
case class CC_B(a: CC_A[T_A], b: T_B) extends T_A
case class CC_C(a: CC_A[T_A]) extends T_A
case class CC_D(a: CC_C, b: T_B, c: CC_A[CC_C]) extends T_B

val v_a: CC_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, 'x', 'x') => 0 
  case CC_A(CC_C(_), _, 'x') => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_B(_, _), 'x', _) => 3 
  case CC_A(CC_C(_), _, _) => 4 
  case CC_A(CC_B(_, _), _, 'x') => 5 
  case CC_A(CC_A(_, _, _), 'x', 'x') => 6 
  case CC_A(_, 'x', _) => 7 
  case CC_A(CC_B(_, _), _, _) => 8 
  case CC_A(CC_C(_), 'x', 'x') => 9 
  case CC_A(CC_C(_), 'x', _) => 10 
}
}
// This is not matched: (CC_A Char (CC_A T_A Wildcard Wildcard Wildcard T_A) Char Wildcard T_A)
// This is not matched: Pattern match is empty without constants