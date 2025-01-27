package Program_7 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Int) extends T_A
case class CC_C(a: T_B[T_A]) extends T_B[T_A]
case class CC_D(a: CC_C, b: Int, c: T_A) extends T_B[T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}