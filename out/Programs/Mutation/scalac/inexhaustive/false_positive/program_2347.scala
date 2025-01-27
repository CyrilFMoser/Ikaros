package Program_31 

object Test {
sealed trait T_B
case class CC_B(a: Char) extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B('x') => 0 
}
}
// This is not matched: (CC_A (CC_B Wildcard
//            (CC_A Wildcard Wildcard T_A)
//            (CC_A Wildcard Wildcard T_A)
//            T_A)
//      Boolean
//      T_A)
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 1 to a constant expression:
// {
//  12
// }
//