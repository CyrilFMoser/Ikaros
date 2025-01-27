package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B(a: CC_A) extends T_A
case class CC_C[A](a: A, b: A) extends T_B
case class CC_D(a: (Char,CC_A), b: T_A) extends T_B
case class CC_E(a: CC_D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(_, _) => 1 
  case CC_D((_,CC_A(_)), CC_B(_)) => 2 
  case CC_D(('x',CC_A(_)), CC_A(_)) => 3 
  case CC_D(('x',CC_A(_)), _) => 4 
  case CC_E(_) => 5 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_B)
// This is not matched: (CC_B T_A)