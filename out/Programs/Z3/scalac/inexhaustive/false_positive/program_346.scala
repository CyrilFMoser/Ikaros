package Program_31 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, (Int,Int)], c: Int) extends T_A
case class CC_B(a: T_B[CC_A, T_A]) extends T_A
case class CC_C[C, D]() extends T_B[CC_B, C]

val v_a: T_B[CC_B, CC_B] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C (CC_B T_A T_A) T_A (T_B (CC_B T_A (T_B T_A T_A)) (CC_B T_A T_A)))
// This is not matched: (CC_C (CC_B T_A T_A) T_A (T_B (CC_B T_A (T_B T_A T_A)) (CC_B T_A T_A)))