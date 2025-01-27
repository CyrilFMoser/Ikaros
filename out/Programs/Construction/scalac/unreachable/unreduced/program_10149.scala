package Program_1 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A(a: T_A) extends T_A
case class CC_B(a: T_B[T_A]) extends T_A
case class CC_C() extends T_A
case class CC_D() extends T_B[T_B[CC_A]]
case class CC_E(a: CC_D, b: CC_A, c: CC_B) extends T_B[T_B[CC_A]]
case class CC_F[B](a: CC_A, b: CC_C, c: CC_D) extends T_B[T_B[CC_A]]

val v_a: T_B[T_B[CC_A]] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_, _, CC_B(_)) => 1 
  case CC_F(CC_A(CC_A(_)), CC_C(), CC_D()) => 2 
  case CC_F(CC_A(CC_B(_)), CC_C(), CC_D()) => 3 
  case CC_F(CC_A(CC_C()), CC_C(), CC_D()) => 4 
}
}