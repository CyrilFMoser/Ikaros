package Program_31 

object Test {
sealed trait T_A
case class CC_B(a: Byte) extends T_A

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_B Wildcard Wildcard (T_A (T_A Byte Byte) (Tuple Byte (Tuple Int Boolean))))
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 1 to a constant expression:
// {
//  'x'
// }
//