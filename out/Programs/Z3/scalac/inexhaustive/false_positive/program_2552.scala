package Program_30 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, T_A[C, C]]
case class CC_B(a: CC_A[Boolean, Boolean]) extends T_A[Int, T_A[Int, Int]]
case class CC_C(a: CC_B) extends T_A[Int, T_A[Int, Int]]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A()) => 1 
  case CC_C(_) => 2 
}
}
// This is not matched: (CC_A Int Boolean (T_A Int (T_A Int Int)))
// This is not matched: (CC_A Int Boolean (T_A Int (T_A Int Int)))