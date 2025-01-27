package Program_63 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[Boolean], b: D) extends T_A[D, T_A[Char, D]]
case class CC_B() extends T_B[T_B[Int]]

val v_a: T_A[Int, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, 12) => 0 
}
}
// This is not matched: (CC_A Char (T_A Char Char))
// Mutation information: 
// Expanded _ at position 0 into: 
// {
//  CC_A()
// }
//