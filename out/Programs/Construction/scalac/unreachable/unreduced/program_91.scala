package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[Byte, E]]
case class CC_B(a: T_A[T_B[Boolean, Char], CC_A[(Char,Byte)]], b: T_A[CC_A[Int], T_B[Byte, CC_A[Int]]], c: T_A[T_B[Char, (Byte,Char)], T_B[Byte, T_B[Char, (Byte,Char)]]]) extends T_A[(CC_A[Char],Int), T_B[Byte, (CC_A[Char],Int)]]
case class CC_C[F]() extends T_A[F, T_B[Byte, F]]

val v_a: T_A[(CC_A[Char],Int), T_B[Byte, (CC_A[Char],Int)]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, CC_C(), CC_A()) => 1 
  case CC_B(_, CC_A(), CC_C()) => 2 
  case CC_B(_, CC_C(), CC_C()) => 3 
  case CC_C() => 4 
}
}
// This is not matched: CC_B(_, CC_A(), CC_A())