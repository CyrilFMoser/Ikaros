package Program_14 

package Program_1 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: T_A, c: T_B) extends T_A
case class CC_B(a: T_B, b: Int) extends T_A
case class CC_C(a: T_A, b: CC_A[CC_B], c: T_A) extends T_B
case class CC_D() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_C(_, _, _), _) => 1 
  case CC_B(_, _) => 2 
  case CC_B(CC_D(), 12) => 3 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_D Char Char (T_B Char Char))