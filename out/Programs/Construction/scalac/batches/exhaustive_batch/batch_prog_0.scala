package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_A]) extends T_A
case class CC_B(a: T_A, b: Boolean, c: T_B[T_A]) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}