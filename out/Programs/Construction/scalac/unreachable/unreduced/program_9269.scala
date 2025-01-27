package Program_20 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[Byte, T_B[CC_A, CC_A]]) extends T_A
case class CC_C(a: CC_A) extends T_A
case class CC_D[C](a: C, b: CC_A) extends T_B[CC_A, C]
case class CC_E(a: Boolean, b: T_B[CC_A, T_B[CC_A, Char]]) extends T_B[CC_A, Char]
case class CC_F[D](a: D) extends T_B[CC_A, Char]

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
  case CC_A(CC_C(CC_A(_))) => 2 
}
}