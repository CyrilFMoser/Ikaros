package Program_14 

package Program_10 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: T_A) extends T_A

val v_a: CC_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(0, CC_A(_, CC_A(_, _, _), _), _) => 0 
}
}
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
// }
//
// This is not matched: (CC_C Boolean Char (T_A (CC_B Int Boolean Boolean Boolean Boolean)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_A()
//  CC_B(_, _, _)
// }
//