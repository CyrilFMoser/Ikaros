package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[Int, T_B]) extends T_A[T_B, T_A[T_A[T_B, T_B], T_B]]
case class CC_B(a: Boolean, b: (CC_A,T_A[T_B, T_B]), c: CC_A) extends T_A[T_B, T_B]
case class CC_C() extends T_A[T_B, T_B]
case class CC_D() extends T_B

val v_a: T_A[T_B, T_B] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_A(_)) => 0 
  case CC_C() => 1 
}
}