package Program_27 

package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A() extends T_A[T_B[Int, Int], T_A[Int, Int]]
case class CC_B[E](a: T_B[E, E], b: Byte, c: T_B[Byte, E]) extends T_A[T_B[Int, Int], T_A[Int, Int]]
case class CC_C[F]() extends T_B[CC_A, F]
case class CC_D[H, G]() extends T_B[G, H]
case class CC_E[I](a: I, b: Boolean, c: (CC_A,CC_A)) extends T_B[CC_A, I]

val v_a: T_A[T_B[Int, Int], T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_D(), _, CC_D()) => 1 
  case CC_B(CC_C(), _, CC_D()) => 2 
  case CC_B(CC_D(), 0, CC_D()) => 3 
  case CC_B(CC_D(), 0, _) => 4 
  case CC_B(CC_E(_, _, _), _, _) => 4 
  case CC_B(CC_E(_, _, _), 0, _) => 4 
  case CC_B(_, 0, CC_D()) => 5 
  case CC_B(CC_E(_, _, _), _, CC_D()) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B(CC_C(), 0, CC_D()) => 8 
  case CC_B(CC_E(_, _, _), 0, CC_D()) => 9 
}
}
// This is not matched: (CC_B (CC_A (T_A Boolean (T_A Boolean (T_A (T_A Boolean Boolean) Boolean))))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_B Int Int) (T_A Int Int)))
// Mutation information: 
// Expanded _ at position 4 into: 
// {
//  CC_C()
//  CC_D()
//  CC_E(_, _, _)
// }
//
// This is not matched: (CC_B (CC_A (T_A Boolean (T_A Boolean (T_A (T_A Boolean Boolean) Boolean))))
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A (T_B Int Int) (T_A Int Int)))
// Mutation information: 
// Deleted Pattern CC_B(CC_E(_, _, _), 0, _) at position 7