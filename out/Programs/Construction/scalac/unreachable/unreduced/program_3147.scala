package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: Int, c: C) extends T_A[C, T_A[C, C]]
case class CC_B(a: Byte, b: T_B) extends T_B
case class CC_C(a: CC_B, b: T_B) extends T_B
case class CC_D(a: T_A[CC_C, T_A[T_B, CC_B]]) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, CC_B(_, _)), _) => 0 
  case CC_C(CC_B(_, CC_C(_, _)), _) => 1 
  case CC_C(CC_B(_, CC_D(_)), _) => 2 
}
}