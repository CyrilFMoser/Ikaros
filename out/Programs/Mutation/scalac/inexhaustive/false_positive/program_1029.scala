package Program_49 

package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F]() extends T_A[E, T_B[E, E]]
case class CC_B[G](a: Int, b: CC_A[G, G], c: CC_A[G, G]) extends T_B[T_B[(Boolean,Int), Int], G]
case class CC_C[H](a: T_B[H, H], b: CC_B[Boolean], c: CC_B[H]) extends T_B[T_B[(Boolean,Int), Int], H]
case class CC_D[I]() extends T_B[T_B[(Boolean,Int), Int], I]

val v_a: T_A[Int, T_B[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A Int (T_B Int Int)))
// This is not matched: (CC_C (CC_A (T_A (T_A Boolean)) (T_A Boolean) (T_A Boolean) (T_A Boolean))
//      Boolean
//      Int
//      Wildcard
//      Wildcard
//      (T_B (CC_A (T_A (T_A Boolean)) (T_A Boolean) (T_A Boolean) (T_A Boolean))))
// Mutation information: 
// Expanded _ at position 3 into: 
// {
//  CC_B(_, _, _)
// }
//