package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_B(a: Boolean, b: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_A[T_B]

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_C()) => 0 
}
}
// This is not matched: (CC_C Int Boolean Boolean (CC_B Boolean (T_A Boolean)) (T_B Int Boolean))