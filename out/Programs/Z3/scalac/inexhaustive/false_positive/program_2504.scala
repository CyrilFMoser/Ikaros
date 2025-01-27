package Program_28 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C]() extends T_A[T_B, C]
case class CC_B(a: T_A[Boolean, T_B], b: CC_A[Int], c: (T_B,T_B)) extends T_A[T_B, T_A[T_B, T_B]]
case class CC_D() extends T_B
case class CC_E() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, _, (_,CC_E())) => 0 
}
}
// This is not matched: (CC_C (T_A (T_A Boolean)))