package Program_63 

object Test {
sealed trait T_A[A]
case class CC_A(a: T_A[Int], b: Int) extends T_A[T_A[Byte]]

val v_a: T_A[T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
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