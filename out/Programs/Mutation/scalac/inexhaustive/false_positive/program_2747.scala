package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A() extends T_A[T_B[Byte]]
case class CC_B(a: T_B[Int]) extends T_A[T_B[Byte]]
case class CC_C[C]() extends T_B[C]
case class CC_D[D](a: T_B[D], b: D, c: (CC_A,CC_B)) extends T_B[D]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, (_,CC_B(CC_D(_, _, _)))) => 0 
}
}
// This is not matched: (CC_D Int (CC_C Int (T_B Int)) Wildcard Wildcard (T_B Int))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_C()
//  CC_D(_, _, _)
// }
//