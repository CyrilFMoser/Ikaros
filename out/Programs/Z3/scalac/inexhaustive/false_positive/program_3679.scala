package Program_14 

package Program_11 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D]() extends T_A[C, (Int,Boolean)]

val v_a: T_A[Int, (Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
}
}
// This is not matched: (CC_A Int Boolean (T_A Int (Tuple Int Boolean)))
// This is not matched: (CC_C (CC_B T_A T_A) (CC_B T_A T_A) T_A (T_B (CC_B T_A T_A) (CC_B T_A T_A)))