package Program_0 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[(T_A,T_A), T_A]) extends T_A
case class CC_B[C](a: Char, b: T_A, c: C) extends T_A
case class CC_C[D](a: T_B[D, D], b: D) extends T_B[(CC_A,CC_B[CC_A]), D]
case class CC_D(a: Int, b: CC_A, c: Byte) extends T_B[(CC_A,CC_B[CC_A]), T_A]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, _) => 1 
}
}