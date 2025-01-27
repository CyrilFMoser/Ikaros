package Program_24 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_A, Boolean], b: T_A) extends T_A
case class CC_B(a: CC_A, b: Char) extends T_A
case class CC_C[C](a: T_B[CC_B, C]) extends T_B[CC_B, C]
case class CC_D(a: CC_A) extends T_B[CC_B, T_A]

val v_a: T_B[CC_B, T_A] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(CC_C(_))) => 0 
  case CC_C(CC_C(CC_D(_))) => 1 
  case CC_C(CC_D(CC_A(_, _))) => 2 
  case CC_D(_) => 3 
}
}