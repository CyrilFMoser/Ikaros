package Program_31 

package Program_13 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: Byte, c: Boolean) extends T_A[B]
case class CC_B[C, D](a: T_A[C], b: T_A[C]) extends T_A[C]

val v_a: CC_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _), _) => 0 
  case CC_B(_, CC_A(CC_B(_, _), _, _)) => 1 
  case CC_B(_, CC_A(CC_A(_, _, _), _, _)) => 1 
}
}
// This is not matched: (CC_B Int
//      Char
//      (CC_A Int Wildcard Wildcard Boolean (T_A Int))
//      (CC_B Int
//            Boolean
//            (CC_B Int Boolean Wildcard Wildcard (T_A Int))
//            Wildcard
//            (T_A Int))
//      (T_A Int))
// Mutation information: 
// Expanded _ at position 1 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _)
// }
//
// This is not matched: (CC_C (T_A (CC_A Byte Boolean)))
// Mutation information: 
// Deleted Pattern CC_B(CC_A(), _) at position 1