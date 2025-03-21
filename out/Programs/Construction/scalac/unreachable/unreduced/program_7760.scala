package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Char) extends T_A[T_B]
case class CC_B(a: T_A[(T_B,T_B)], b: T_A[T_B]) extends T_A[T_B]
case class CC_C() extends T_B
case class CC_D() extends T_B
case class CC_E(a: T_A[T_A[CC_B]], b: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C() => 0 
  case CC_D() => 1 
  case CC_E(_, CC_B(_, CC_A(_))) => 2 
  case CC_E(_, CC_B(_, CC_B(_, _))) => 3 
}
}