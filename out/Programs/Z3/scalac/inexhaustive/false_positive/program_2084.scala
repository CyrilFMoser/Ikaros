package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A() extends T_A[Int]
case class CC_B[B, C](a: T_A[Int]) extends T_A[B]
case class CC_C(a: (CC_A,Int), b: CC_A, c: T_A[Int]) extends T_A[Int]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_B(CC_C(_, _, _)) => 1 
}
}
// This is not matched: (CC_B (CC_C Boolean Boolean (T_A Boolean) Boolean)
//      Boolean
//      (CC_A (T_A Int))
//      (T_A (CC_C Boolean Boolean (T_A Boolean) Boolean)))
// This is not matched: (CC_B T_A)