package Program_20 

package Program_26 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: Int, b: Char) extends T_A
case class CC_B(a: Boolean, b: T_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_A(_, _)) => 0 
}
}
// This is not matched: (CC_B Wildcard (CC_A T_A Int Char T_A) T_B)
// This is not matched: (CC_D Byte Wildcard Wildcard (T_B Byte))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 1 to a constant expression:
// {
//  12
// }
//