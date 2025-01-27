package Program_62 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A]() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A T_A T_A)
// This is not matched: (CC_A Wildcard
//      (CC_D Char Wildcard Wildcard (T_B Char))
//      Wildcard
//      (T_A (T_A Byte)))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 1 to a constant expression:
// {
//  12
// }
//