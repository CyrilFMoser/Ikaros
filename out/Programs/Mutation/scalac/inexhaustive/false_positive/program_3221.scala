package Program_24 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Int)) extends T_A
case class CC_B() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_A(_),_)) => 0 
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