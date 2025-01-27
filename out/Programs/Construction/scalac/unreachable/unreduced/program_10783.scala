package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_A[(T_B,Char)]) extends T_A[T_A[T_A[T_B]]]
case class CC_B(a: CC_A, b: Byte, c: T_B) extends T_B
case class CC_C(a: Boolean, b: CC_B, c: CC_B) extends T_B
case class CC_D(a: Boolean, b: T_B, c: CC_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_A(CC_B(_, _, _), _), _, _) => 0 
  case CC_B(CC_A(CC_C(_, _, _), _), _, _) => 1 
  case CC_B(CC_A(CC_D(_, _, _), _), _, _) => 2 
  case CC_C(_, CC_B(_, 0, _), CC_B(_, _, _)) => 3 
  case CC_C(_, CC_B(_, _, _), CC_B(_, _, _)) => 4 
  case CC_D(_, CC_B(_, _, CC_B(_, _, _)), CC_B(_, _, _)) => 5 
  case CC_D(_, CC_B(_, _, CC_C(_, _, _)), CC_B(_, _, _)) => 6 
  case CC_D(_, CC_B(_, _, CC_D(_, _, _)), CC_B(_, _, _)) => 7 
  case CC_D(_, CC_C(true, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 8 
  case CC_D(_, CC_C(false, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 9 
  case CC_D(_, CC_D(_, CC_B(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 10 
  case CC_D(_, CC_D(_, CC_C(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 11 
  case CC_D(_, CC_D(_, CC_D(_, _, _), CC_B(_, _, _)), CC_B(_, _, _)) => 12 
}
}