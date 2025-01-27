package Program_21 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C](a: C) extends T_A[C]
case class CC_C[D, E](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_B(_), _, _)) => 0 
  case CC_A(CC_C(CC_A(_), _, _)) => 0 
}
}
// This is not matched: (CC_A Byte
//      (CC_A Byte
//            (CC_A Byte (CC_A Byte Wildcard (T_A Byte)) (T_A Byte))
//            (T_A Byte))
//      (T_A Byte))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_)
//  CC_B(_)
// }
//
// This is not matched: (CC_A T_A Wildcard T_A)
// Mutation information: 
// Deleted Pattern CC_A(CC_B()) at position 0