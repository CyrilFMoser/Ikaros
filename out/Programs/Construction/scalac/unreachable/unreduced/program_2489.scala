package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[T_A[Int, (Byte,Char)], Boolean], b: T_A[T_A[Byte, T_B], (Byte,Char)]) extends T_A[T_A[(T_B,T_B), T_A[(Char,Boolean), T_B]], T_A[T_B, T_A[T_B, T_B]]]
case class CC_B(a: T_A[CC_A, T_A[(Byte,Char), CC_A]], b: T_B) extends T_B
case class CC_C(a: T_A[CC_A, T_A[T_B, CC_B]]) extends T_B
case class CC_D() extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_, CC_B(_, CC_B(_, _))) => 0 
  case CC_B(_, CC_B(_, CC_C(_))) => 1 
  case CC_B(_, CC_B(_, CC_D())) => 2 
  case CC_B(_, CC_C(_)) => 3 
  case CC_B(_, CC_D()) => 4 
  case CC_C(_) => 5 
  case CC_D() => 6 
}
}