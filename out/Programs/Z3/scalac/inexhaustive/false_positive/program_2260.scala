package Program_31 

package Program_6 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B[B, C](a: T_B[C], b: Char, c: B) extends T_B[B]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, _) => 0 
  case CC_B(CC_B(_, _, _), 'x', CC_A(_)) => 1 
  case CC_B(_, 'x', CC_A(_)) => 2 
  case CC_B(_, _, _) => 3 
  case CC_B(_, _, CC_A(_)) => 4 
  case CC_B(_, 'x', _) => 5 
}
}
// This is not matched: (CC_B (CC_A (T_B T_A) T_A)
//      T_A
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A (T_B T_A) T_A)))
// This is not matched: (CC_A Wildcard (CC_B T_A T_A) Wildcard T_A)