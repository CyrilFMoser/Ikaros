package Program_4 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: Byte) extends T_A
case class CC_B(a: Boolean, b: T_A, c: T_B[Byte, (T_A,T_A)]) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[C, C]) extends T_B[C, Char]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(0) => 0 
  case CC_A(_) => 1 
  case CC_B(_, CC_A(_), _) => 2 
  case CC_B(_, CC_B(_, CC_A(_), _), _) => 3 
  case CC_B(_, CC_B(_, CC_B(_, _, _), _), _) => 4 
  case CC_B(_, CC_B(_, CC_C(), _), _) => 5 
  case CC_B(_, CC_C(), _) => 6 
  case CC_C() => 7 
}
}