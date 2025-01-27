package Program_11 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A(a: T_B[T_B[Byte, T_A], T_B[Int, (Char,Byte)]], b: T_A, c: T_B[T_B[T_A, (Boolean,Byte)], Char]) extends T_A
case class CC_B(a: (T_A,CC_A), b: T_A, c: CC_A) extends T_A
case class CC_C() extends T_A
case class CC_D[C](a: T_B[C, C]) extends T_B[T_A, C]
case class CC_E[D]() extends T_B[T_A, D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, CC_A(_, _, _), _), _) => 0 
  case CC_A(_, CC_A(_, CC_B(_, _, _), _), _) => 1 
  case CC_A(_, CC_A(_, CC_C(), _), _) => 2 
  case CC_A(_, CC_B(_, CC_A(_, _, _), _), _) => 3 
  case CC_A(_, CC_B(_, CC_B(_, _, _), _), _) => 4 
  case CC_A(_, CC_B(_, CC_C(), _), _) => 5 
  case CC_A(_, CC_C(), _) => 6 
  case CC_B(_, _, _) => 7 
  case CC_C() => 8 
}
}