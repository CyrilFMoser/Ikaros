package Program_31 

package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, Int]) extends T_A
case class CC_B(a: T_B[CC_A, CC_A], b: (CC_A,CC_A)) extends T_A
case class CC_C[C](a: C, b: C, c: Char) extends T_A
case class CC_D[D](a: CC_B) extends T_B[D, CC_C[CC_B]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(_, _, 'x') => 0 
  case CC_C(_, _, _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_A(CC_C(_, _, _), _) => 3 
  case CC_A(_, _) => 4 
  case CC_B(_, _) => 5 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_B Char (T_B Char))