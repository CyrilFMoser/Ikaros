package Program_12 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: Boolean, b: CC_A, c: T_B[CC_A, T_A]) extends T_A
case class CC_C(a: CC_B, b: T_B[CC_B, CC_A]) extends T_A
case class CC_D[C](a: CC_C) extends T_B[Int, C]
case class CC_E[D](a: CC_A, b: D, c: CC_C) extends T_B[Int, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_B(_, _, _), _) => 1 
}
}
// This is not matched: CC_B(_, CC_A(_), _)