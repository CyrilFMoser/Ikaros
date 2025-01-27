package Program_8 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[(T_B,T_B)], c: T_A[T_A[T_B]]) extends T_A[T_B]
case class CC_B(a: Boolean, b: T_B) extends T_B
case class CC_C(a: CC_A, b: CC_A, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_C(_, CC_A(CC_B(_, _), _, _), CC_B(true, _)) => 1 
  case CC_C(_, CC_A(CC_C(_, _, _), _, _), CC_B(true, _)) => 2 
  case CC_C(_, CC_A(CC_B(_, _), _, _), CC_B(false, _)) => 3 
  case CC_C(_, CC_A(CC_C(_, _, _), _, _), CC_B(false, _)) => 4 
}
}