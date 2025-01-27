package Program_31 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A], b: (T_A,T_A), c: T_B[T_A]) extends T_A
case class CC_B() extends T_A
case class CC_C[B, C](a: Char, b: T_A) extends T_B[B]
case class CC_D[D](a: Char, b: T_A) extends T_B[D]
case class CC_E(a: CC_C[CC_A, (Char,Int)]) extends T_B[(T_A,CC_B)]

val v_a: T_B[CC_E] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_, _, _)) => 0 
  case CC_D('x', _) => 1 
  case CC_D(_, _) => 2 
  case CC_D('x', CC_A(_, _, _)) => 3 
  case CC_C(_, CC_A(_, _, _)) => 4 
  case CC_C('x', CC_B()) => 5 
  case CC_C(_, _) => 6 
}
}
// This is not matched: (CC_C (CC_E (T_B T_A) T_A) T_A Wildcard (CC_B T_A) (T_B (CC_E (T_B T_A) T_A)))
// This is not matched: (CC_A Int Boolean (T_A Int Boolean))