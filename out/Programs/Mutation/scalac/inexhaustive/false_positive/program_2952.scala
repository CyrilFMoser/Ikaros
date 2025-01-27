package Program_29 

object Test {
sealed trait T_A[A, B]
case class CC_B[F, G](a: Byte) extends T_A[F, G]

val v_a: CC_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_F Char Wildcard Wildcard (T_B Char (CC_B Char Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A()
//  CC_B(_)
//  CC_C(_)
// }
//