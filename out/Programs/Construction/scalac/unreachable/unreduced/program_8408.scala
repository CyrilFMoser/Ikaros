package Program_29 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_A, b: T_B[T_A, T_B[T_A, T_A]]) extends T_A
case class CC_B() extends T_A
case class CC_C(a: T_B[CC_B, T_B[T_A, CC_B]], b: T_B[CC_B, CC_A]) extends T_A
case class CC_D[C](a: T_B[T_A, C]) extends T_B[T_A, C]
case class CC_E[D](a: CC_C, b: CC_B) extends T_B[T_A, D]

val v_a: T_B[T_A, T_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_D(CC_D(_))) => 0 
  case CC_D(CC_D(CC_E(_, _))) => 1 
  case CC_D(CC_E(CC_C(_, _), CC_B())) => 2 
  case CC_E(CC_C(_, _), CC_B()) => 3 
}
}