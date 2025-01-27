package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_B() extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_C(a: T_A[CC_A, Boolean], b: Byte, c: CC_A) extends T_A[T_A[T_B, T_A[T_B, T_B]], T_B]
case class CC_D(a: T_A[T_B, CC_C], b: Byte) extends T_B
case class CC_E() extends T_B
case class CC_F[C](a: CC_A, b: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, _) => 0 
  case CC_E() => 1 
  case CC_F(_, true) => 2 
  case CC_F(_, false) => 3 
}
}