package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A() extends T_A
case class CC_B(a: CC_A, b: T_A) extends T_A
case class CC_C(a: CC_A, b: T_B[Int, T_A]) extends T_A
case class CC_D[C](a: T_B[C, Byte]) extends T_B[C, T_B[C, C]]
case class CC_E[D](a: D, b: Byte) extends T_B[D, T_B[D, D]]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_A(), _) => 1 
}
}
// This is not matched: CC_B(CC_A(), _)