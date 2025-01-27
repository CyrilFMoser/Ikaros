package Program_29 

object Test {
sealed trait T_A
case class CC_A(a: Int) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_A Byte Byte) (Tuple Byte (Tuple Int Boolean))))
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 1 to a constant expression:
// {
//  'x'
// }
//