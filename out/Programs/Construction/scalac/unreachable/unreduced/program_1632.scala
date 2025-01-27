package Program_23 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char], b: Byte) extends T_A[T_B]
case class CC_B(a: Int, b: T_B) extends T_A[T_B]
case class CC_C() extends T_A[T_B]
case class CC_D(a: ((Byte,Char),CC_B), b: Int, c: T_A[T_B]) extends T_B
case class CC_E() extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_D(_, _, _)) => 1 
  case CC_B(_, CC_E()) => 2 
}
}
// This is not matched: CC_C()