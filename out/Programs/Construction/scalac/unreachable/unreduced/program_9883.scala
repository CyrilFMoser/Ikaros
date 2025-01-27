package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Boolean) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: T_B) extends T_A[T_A[T_A[T_B]]]
case class CC_C(a: T_B, b: CC_A[CC_A[T_B]], c: Char) extends T_A[T_A[T_A[T_B]]]
case class CC_D(a: T_A[(T_B,CC_C)]) extends T_B
case class CC_E(a: CC_C, b: (CC_A[CC_C],CC_A[Char])) extends T_B
case class CC_F() extends T_B

val v_a: CC_B = null
val v_b: Int = v_a match{
  case CC_B(CC_D(_)) => 0 
  case CC_B(CC_E(_, _)) => 1 
  case CC_B(CC_F()) => 2 
}
}