package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: T_A[C, T_B]) extends T_A[C, T_B]
case class CC_B[D](a: Boolean) extends T_A[D, T_B]
case class CC_C(a: CC_A[Int], b: T_A[Int, T_A[T_B, T_B]], c: T_B) extends T_B
case class CC_D(a: T_A[CC_A[(Boolean,Char)], CC_C], b: CC_C, c: T_A[(T_B,T_B), T_B]) extends T_B
case class CC_E(a: Int, b: CC_B[Int], c: CC_A[T_A[Byte, T_B]]) extends T_B

val v_a: T_A[Boolean, T_B] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(CC_A(_, _), _, _), CC_A(_, CC_A(_, _))) => 0 
  case CC_A(CC_C(CC_A(_, _), _, _), CC_A(_, CC_B(_))) => 1 
  case CC_A(CC_C(CC_A(_, _), _, _), CC_B(_)) => 2 
  case CC_A(CC_D(_, _, _), CC_A(_, CC_A(_, _))) => 3 
  case CC_A(CC_D(_, _, _), CC_A(_, CC_B(_))) => 4 
  case CC_A(CC_D(_, _, _), CC_B(_)) => 5 
  case CC_A(CC_E(_, _, _), CC_A(_, CC_A(_, _))) => 6 
  case CC_A(CC_E(_, _, _), CC_A(_, CC_B(_))) => 7 
  case CC_A(CC_E(_, _, _), CC_B(_)) => 8 
  case CC_B(_) => 9 
}
}