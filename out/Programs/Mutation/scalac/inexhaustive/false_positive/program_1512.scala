package Program_59 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[Int], b: Char) extends T_A[T_B[Int]]
case class CC_B[C, D]() extends T_B[C]
case class CC_C[E](a: Byte, b: T_B[E]) extends T_B[E]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, CC_C(_, _)) => 1 
  case CC_C(_, _) => 2 
}
}
// This is not matched: (CC_B Int Boolean (T_B Int))
// Mutation information: 
// Deleted Pattern CC_C(_, CC_B()) at position 3
// This is not matched: (CC_B (T_B (Tuple Boolean Int) (T_A Int))
//      (CC_D (T_B (Tuple Boolean Int) (T_A Int)))
//      (CC_D (T_B (Tuple Boolean Int) (T_A Int)))
//      (CC_A (T_B (Tuple Boolean Int) (T_A Int))
//            Wildcard
//            Boolean
//            (CC_C (T_A Int)
//                  (Tuple Boolean Int)
//                  Wildcard
//                  (T_B (Tuple Boolean Int) (T_A Int)))
//            (T_A (T_B (Tuple Boolean Int) (T_A Int))))
//      (T_A (T_B (Tuple Boolean Int) (T_A Int))))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A(_, _, _)
//  CC_B(_, _, _)
// }
//