package Program_27 

object Test {
sealed trait T_A
case class CC_A(a: Int) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(12) => 0 
}
}
// This is not matched: (CC_A (Tuple (CC_B Wildcard (CC_A Wildcard Int Wildcard T_A) T_A) Wildcard)
//      Wildcard
//      (CC_B Wildcard
//            (CC_A (Tuple Wildcard Wildcard)
//                  Wildcard
//                  (CC_B Wildcard Wildcard T_A)
//                  T_A)
//            T_A)
//      T_A)
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 2 to a constant expression:
// {
//  12
// }
//