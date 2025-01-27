package Program_31 

package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: T_B[Byte], c: T_B[T_A]) extends T_A
case class CC_B[B, C](a: Char, b: CC_A, c: T_B[B]) extends T_B[B]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _, _), _) => 0 
  case CC_B('x', _, CC_B(_, _, _)) => 1 
  case CC_B('x', CC_A(_, _, _), CC_B(_, _, _)) => 2 
  case CC_B(_, _, CC_B(_, _, _)) => 3 
}
}
// This is not matched: (CC_B (CC_A T_A T_A T_A T_A)
//      T_A
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_B (CC_A T_A T_A T_A T_A)))
// This is not matched: (CC_C Boolean Wildcard (T_A Boolean))