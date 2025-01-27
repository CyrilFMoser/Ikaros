package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_B], b: Int, c: T_B) extends T_A[T_A[T_B]]
case class CC_C() extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_E()) => 0 
}
}
// This is not matched: (CC_A (CC_B T_A) T_A)