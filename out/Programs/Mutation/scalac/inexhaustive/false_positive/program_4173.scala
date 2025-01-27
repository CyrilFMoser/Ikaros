package Program_26 

package Program_13 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: T_A) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Byte Wildcard Wildcard (CC_A T_A Wildcard Wildcard Wildcard T_A) T_A)
// This is not matched: (CC_C Boolean Char (T_A (CC_B Int Boolean Boolean Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//