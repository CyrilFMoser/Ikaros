package Program_31 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_C(), _) => 0 
}
}
// This is not matched: (CC_A Wildcard
//      (CC_B (CC_D (CC_A Wildcard Wildcard Wildcard Wildcard)
//                  T_A
//                  (T_B (CC_A Wildcard Wildcard Wildcard Wildcard) T_A))
//            (CC_C T_A)
//            T_A)
//      (CC_B Wildcard
//            (CC_A Wildcard (CC_C T_A) (CC_B Wildcard Wildcard T_A) T_A)
//            T_A)
//      T_A)
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _)
// }
//