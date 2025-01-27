package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C(a: T_B[T_B[CC_A]], b: CC_A, c: T_B[(T_A,CC_A)]) extends T_B[T_B[CC_A]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
}
}
// This is not matched: CC_B(_)