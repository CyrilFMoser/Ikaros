package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[Byte]) extends T_A[Byte]
case class CC_B(a: T_A[Byte], b: T_B, c: Boolean) extends T_B
case class CC_C(a: T_A[T_A[Byte]], b: T_A[CC_B]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(CC_A(_, _), _, _), true) => 0 
  case CC_B(_, CC_C(_, _), true) => 1 
  case CC_B(_, CC_B(CC_A(_, _), _, _), false) => 2 
  case CC_B(_, CC_C(_, _), false) => 3 
  case CC_C(_, _) => 4 
}
}