package Program_29 

object Test {
sealed trait T_A[A]
case class CC_C[D](a: (Boolean,Byte)) extends T_A[D]

val v_a: CC_C[Char] = null
val v_b: Int = v_a match{
  case CC_C((_,0)) => 0 
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