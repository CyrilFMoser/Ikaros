package Program_54 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: (Int,Int), b: T_A[(Int,Int)], c: T_A[Boolean]) extends T_A[T_B[Int]]
case class CC_B[C, D](a: Boolean, b: T_B[D], c: T_A[D]) extends T_B[C]
case class CC_C[E, F](a: Int, b: T_B[E], c: T_B[F]) extends T_B[E]

val v_a: T_B[CC_A] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_, _, _)) => 0 
  case CC_B(_, CC_B(_, _, _), _) => 1 
  case CC_C(12, CC_B(_, _, _), CC_C(_, _, _)) => 2 
  case CC_C(12, CC_C(_, _, _), CC_C(_, _, _)) => 3 
  case CC_C(_, _, _) => 4 
  case CC_C(12, CC_C(_, _, _), CC_B(_, _, _)) => 5 
  case CC_C(_, CC_B(_, _, _), CC_B(_, _, _)) => 6 
  case CC_C(12, _, CC_C(_, _, _)) => 7 
  case CC_C(12, _, CC_B(_, _, _)) => 7 
  case CC_C(12, CC_C(_, _, _), _) => 8 
}
}
// This is not matched: (CC_C (CC_A (T_A (T_A Boolean)) (T_A Boolean) (T_A Boolean) (T_A Boolean))
//      Boolean
//      Int
//      Wildcard
//      Wildcard
//      (T_B (CC_A (T_A (T_A Boolean)) (T_A Boolean) (T_A Boolean) (T_A Boolean))))
// Mutation information: 
// Expanded _ at position 7 into: 
// {
//  CC_B(_, _, _)
//  CC_C(_, _, _)
// }
//
// This is not matched: (CC_C (CC_A (T_A Boolean) Boolean Boolean Boolean)
//      (CC_A Boolean (T_A Boolean) Boolean Boolean)
//      Wildcard
//      Wildcard
//      (CC_C (CC_A Boolean Boolean Boolean Boolean)
//            Boolean
//            Wildcard
//            Wildcard
//            Wildcard
//            (T_B (CC_A Boolean Boolean Boolean Boolean)))
//      (T_B (CC_A (T_A Boolean) Boolean Boolean Boolean)))
// Mutation information: 
// Deleted Pattern CC_C(12, CC_B(_, _, _), _) at position 4