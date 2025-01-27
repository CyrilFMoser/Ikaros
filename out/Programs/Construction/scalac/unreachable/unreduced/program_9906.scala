package Program_27 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[T_A, T_A], Boolean]) extends T_A
case class CC_B() extends T_A
case class CC_C[C](a: Byte, b: T_A) extends T_B[C, CC_A]

val v_a: T_B[T_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, CC_B()) => 1 
}
}