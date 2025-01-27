package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Byte], b: ((Byte,Byte),Byte)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(_, ((0,_),_)) => 0 
}
}
// This is not matched: (CC_B (CC_C Wildcard T_A) T_A)
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_A(_, _)
//  CC_B(_)
//  CC_C(_)
// }
//