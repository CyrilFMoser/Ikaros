package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_B,T_A[T_B]), b: (T_B,T_A[T_B])) extends T_A[T_A[T_B]]
case class CC_C() extends T_B
case class CC_D() extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_D(),_)) => 0 
}
}
// This is not matched: CC_A(_)