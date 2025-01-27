package Program_16 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Byte], b: T_A[C, Byte], c: T_A[C, C]) extends T_A[C, Byte]
case class CC_B(a: ((Char,Boolean),CC_A[Boolean])) extends T_A[T_A[T_A[Boolean, Byte], CC_A[Char]], Byte]
case class CC_C[D]() extends T_A[D, Byte]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_A(_, _, _), _) => 0 
  case CC_A(CC_A(CC_A(_, _, _), CC_A(_, _, _), _), CC_C(), _) => 1 
  case CC_A(CC_A(CC_C(), CC_A(_, _, _), _), CC_A(_, _, _), _) => 2 
  case CC_A(CC_A(CC_C(), CC_A(_, _, _), _), CC_C(), _) => 3 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(), _), CC_A(_, _, _), _) => 4 
  case CC_A(CC_A(CC_A(_, _, _), CC_C(), _), CC_C(), _) => 5 
  case CC_A(CC_A(CC_C(), CC_C(), _), CC_A(_, _, _), _) => 6 
  case CC_A(CC_A(CC_C(), CC_C(), _), CC_C(), _) => 7 
  case CC_A(CC_C(), CC_A(_, _, _), _) => 8 
  case CC_A(CC_C(), CC_C(), _) => 9 
  case CC_C() => 10 
}
}