package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[T_A[T_B]]) extends T_A[T_A[T_B]]
case class CC_B() extends T_B
case class CC_C() extends T_B
case class CC_D(a: CC_A, b: CC_C) extends T_B

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}