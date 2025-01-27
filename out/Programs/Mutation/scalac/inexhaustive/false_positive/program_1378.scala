package Program_47 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Boolean, b: T_A[T_B], c: T_A[B]) extends T_A[B]
case class CC_B(a: CC_A[(Boolean,Boolean)]) extends T_A[T_B]
case class CC_C(a: (CC_B,Char), b: T_B, c: T_A[CC_B]) extends T_A[T_B]
case class CC_D(a: Byte, b: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_), CC_C(_, CC_D(_, _), _)) => 0 
}
}
// This is not matched: (CC_C Wildcard (CC_D Byte (CC_B Wildcard (T_A T_B)) T_B) Wildcard (T_A T_B))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_D(_, _)
// }
//
// This is not matched: (CC_C (CC_F Boolean Boolean (T_A Boolean))
//      Wildcard
//      (CC_B (CC_F Boolean Boolean Boolean)
//            Wildcard
//            Wildcard
//            Char
//            (T_A (CC_F Boolean Boolean Boolean)))
//      (T_A (CC_F Boolean Boolean (T_A Boolean))))
// Mutation information: 
// Expanded _ at position 2 into: 
// {
//  CC_A(_, _)
// }
//