package Program_18 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: T_A[C, Char]) extends T_A[Byte, C]
case class CC_B[D](a: T_A[D, D], b: Boolean) extends T_A[Byte, D]
case class CC_C[E]() extends T_A[Byte, E]

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_A(_, CC_C()) => 2 
  case CC_B(CC_A(CC_A(_, _), _), _) => 3 
  case CC_B(CC_A(CC_B(_, _), _), _) => 4 
  case CC_B(CC_A(CC_C(), _), _) => 5 
  case CC_B(CC_B(CC_A(_, _), _), _) => 6 
  case CC_B(CC_B(CC_B(_, _), _), _) => 7 
  case CC_B(CC_B(CC_C(), _), _) => 8 
  case CC_B(CC_C(), _) => 9 
  case CC_C() => 10 
}
}