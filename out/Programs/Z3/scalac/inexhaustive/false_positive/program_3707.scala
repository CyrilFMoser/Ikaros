package Program_13 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_B) extends T_A
case class CC_B(a: T_B, b: T_A) extends T_A
case class CC_C() extends T_A
case class CC_D[A](a: CC_A, b: Int, c: CC_A) extends T_B
case class CC_E(a: Int) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E(_) => 1 
}
}
// This is not matched: (CC_D T_A Wildcard Int Wildcard T_B)
// This is not matched: (CC_C Boolean Wildcard (T_A (T_A Int)))