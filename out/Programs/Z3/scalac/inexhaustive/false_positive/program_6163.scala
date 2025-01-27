package Program_10 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_C[B]() extends T_B[B]
case class CC_D[C]() extends T_B[C]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
}
}
// This is not matched: (CC_C Int Boolean Boolean (CC_B Boolean (T_A Boolean)) (T_B Int Boolean))