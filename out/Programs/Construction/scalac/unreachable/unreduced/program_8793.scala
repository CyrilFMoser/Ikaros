package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_B[T_B[T_A]]) extends T_A
case class CC_B(a: Char) extends T_A
case class CC_C() extends T_A
case class CC_D(a: Int, b: CC_A, c: CC_C) extends T_B[T_B[Boolean]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: CC_C()