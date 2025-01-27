package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: C) extends T_A[T_A[C, C], C]
case class CC_B[D](a: D, b: T_A[T_A[D, D], D], c: T_A[D, D]) extends T_A[T_A[D, D], D]
case class CC_C() extends T_A[T_A[CC_A[CC_A[(Byte,Byte)]], CC_A[CC_A[(Byte,Byte)]]], CC_A[CC_A[(Byte,Byte)]]]

val v_a: T_A[T_A[Boolean, Boolean], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _), _) => 1 
  case CC_A(CC_B(_, _, _), _) => 2 
  case CC_B(_, CC_A(CC_A(_, _), true), _) => 3 
  case CC_B(_, CC_A(CC_B(_, _, _), true), _) => 4 
  case CC_B(_, CC_A(CC_A(_, _), false), _) => 5 
  case CC_B(_, CC_A(CC_B(_, _, _), false), _) => 6 
  case CC_B(_, CC_B(_, _, _), _) => 7 
}
}