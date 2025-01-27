package Program_23 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B]() extends T_A
case class CC_B(a: T_B[T_B[T_A]], b: T_B[T_B[T_A]]) extends T_A
case class CC_C(a: Int) extends T_A
case class CC_D(a: Boolean) extends T_B[T_A]
case class CC_E() extends T_B[T_A]
case class CC_F(a: CC_E, b: T_A, c: CC_A[CC_A[T_A]]) extends T_B[T_A]

val v_a: CC_F = null
val v_b: Int = v_a match{
  case CC_F(CC_E(), CC_A(), CC_A()) => 0 
  case CC_F(CC_E(), CC_B(_, _), CC_A()) => 1 
  case CC_F(CC_E(), CC_C(_), CC_A()) => 2 
}
}