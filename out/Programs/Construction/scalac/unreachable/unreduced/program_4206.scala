package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Byte, b: T_B) extends T_A[T_B]
case class CC_B(a: T_B, b: CC_A[CC_A[T_B]], c: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[Char]) extends T_A[T_B]
case class CC_D(a: Int) extends T_B
case class CC_E(a: CC_D) extends T_B
case class CC_F(a: Boolean, b: CC_C, c: CC_B) extends T_B

val v_a: CC_A[CC_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_E(CC_D(_))) => 0 
  case CC_A(_, CC_F(_, CC_C(_), CC_B(_, _, _))) => 1 
}
}
// This is not matched: CC_A(_, CC_D(_))