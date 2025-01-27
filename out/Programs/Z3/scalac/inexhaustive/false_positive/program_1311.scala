package Program_31 

package Program_2 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B) extends T_A
case class CC_B(a: T_A) extends T_A
case class CC_C(a: T_A) extends T_A
case class CC_D[A]() extends T_B
case class CC_E(a: CC_C, b: Int) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_E(_, _)) => 0 
  case CC_A(CC_D()) => 1 
}
}
// This is not matched: (CC_A (CC_D T_A T_B) T_A)
// This is not matched: (CC_A Wildcard (T_A (T_A (Tuple Int Char))))