package Program_61 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B(a: T_A[Int], b: T_A[CC_A]) extends T_A[Int]
case class CC_C() extends T_A[Int]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_A() => 1 
  case CC_B(CC_C(), _) => 2 
}
}
// This is not matched: (CC_A (CC_B Wildcard (CC_A Wildcard Wildcard (T_A Int)) Wildcard (T_A Int))
//      Int
//      (T_A Int))
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 9 to a constant expression:
// {
//  12
// }
//