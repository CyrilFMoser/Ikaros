package Program_51 

package Program_14 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: Char, b: T_B[Char]) extends T_A
case class CC_B(a: Char, b: Char) extends T_A
case class CC_C() extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C() => 1 
}
}
// This is not matched: (CC_B Wildcard Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(_, _) at position 0
// This is not matched: (CC_C (CC_F Boolean Boolean (T_A Boolean))
//      Wildcard
//      (CC_B (CC_F Boolean Boolean Boolean)
//            Wildcard
//            Wildcard
//            Char
//            (T_A (CC_F Boolean Boolean Boolean)))
//      (T_A (CC_F Boolean Boolean (T_A Boolean))))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
// }
//