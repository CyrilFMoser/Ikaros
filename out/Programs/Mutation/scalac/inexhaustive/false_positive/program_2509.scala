package Program_30 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: (T_A,T_A)) extends T_A
case class CC_C() extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_A(CC_A(_, _), _),_)) => 0 
}
}
// This is not matched: (CC_A (CC_C T_A)
//      (Tuple (CC_B Boolean Wildcard T_A) (CC_B Boolean Wildcard T_A))
//      T_A)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _)
//  CC_B(_, _)
//  CC_C()
// }
//