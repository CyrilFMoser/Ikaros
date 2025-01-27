package Program_63 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[T_B]) extends T_A[Int]
case class CC_B(a: CC_A) extends T_A[Int]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(CC_A(CC_D(), _)) => 1 
}
}
// This is not matched: (CC_E Int
//      (Tuple (CC_B (CC_A T_A) T_A) (CC_B (CC_A T_A) T_A))
//      Wildcard
//      (T_B Int T_A))
// Mutation information: 
// Expanded _ at position 6 into: 
// {
//  CC_A()
//  CC_B(_)
// }
//