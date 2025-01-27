package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[B]
case class CC_B(a: (Char,Char)) extends T_A[CC_A[Byte]]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(('x',_)) => 0 
}
}
// This is not matched: (CC_B Boolean
//      (CC_A Char
//            Wildcard
//            (CC_A Char Char (CC_A Char Wildcard Wildcard (T_A Char)) (T_A Char))
//            (T_A Char))
//      Wildcard
//      (T_A (T_A Int)))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _)
// }
//