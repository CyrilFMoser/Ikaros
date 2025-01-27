package Program_13 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Int, b: Byte, c: Char) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, T_A]) extends T_B[CC_B, T_A]
case class CC_D(a: T_B[CC_B, CC_A], b: T_B[T_B[T_A, CC_A], Int]) extends T_B[CC_B, T_A]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_)) => 0 
  case CC_C(CC_D(_, _)) => 1 
}
}