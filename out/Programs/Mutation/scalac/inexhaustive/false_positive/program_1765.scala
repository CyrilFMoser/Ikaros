package Program_22 

object Test {
sealed trait T_A[A, B]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[G](a: G) extends T_A[G, CC_A[Char, Char]]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(0) => 0 
}
}
// This is not matched: (CC_A Char
//      Boolean
//      (CC_A Char
//            Boolean
//            (CC_A Char Boolean Wildcard Wildcard (T_A Char))
//            Wildcard
//            (T_A Char))
//      Wildcard
//      (T_A Char))
// Mutation information: 
// Changing a Wildcard in 0 at pattern position 0 to a constant expression:
// {
//  0
// }
//