package Program_27 

package Program_19 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard Wildcard T_A)
// This is not matched: (CC_A Int Byte Wildcard (CC_B Int Int (T_A Int Int)) (T_A Byte Int))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
// }
//