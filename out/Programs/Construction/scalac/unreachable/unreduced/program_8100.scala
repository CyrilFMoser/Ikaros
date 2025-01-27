package Program_3 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: Byte) extends T_A
case class CC_B[D](a: CC_A[D]) extends T_B[D, T_A]
case class CC_C(a: Boolean, b: T_B[(T_A,T_A), T_A]) extends T_B[Char, T_A]

val v_a: T_B[Char, T_A] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _)) => 0 
  case CC_C(true, _) => 1 
  case CC_C(false, _) => 2 
}
}