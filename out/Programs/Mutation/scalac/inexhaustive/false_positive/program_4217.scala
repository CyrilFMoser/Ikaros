package Program_30 

package Program_16 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A, b: T_B[T_A], c: T_A) extends T_A
case class CC_B[B](a: T_A, b: T_A) extends T_B[B]
case class CC_C[C](a: C) extends T_B[Byte]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_B(CC_A(_, _, _), _) => 1 
}
}
// This is not matched: (CC_C T_A Wildcard (T_B Byte))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_C Boolean Boolean (T_B Byte))
// Mutation information: 
// Deleted Pattern CC_B(CC_A(_, _, _), _) at position 2