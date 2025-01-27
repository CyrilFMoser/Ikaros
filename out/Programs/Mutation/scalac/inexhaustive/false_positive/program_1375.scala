package Program_50 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[(Byte,Boolean)]) extends T_A
case class CC_B[B]() extends T_B[B]
case class CC_C[C](a: Byte) extends T_B[C]

val v_a: T_B[T_A] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}
// This is not matched: (CC_B T_A (T_B T_A))
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