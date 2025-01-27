package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C], b: T_A[C, T_A[C, C]]) extends T_A[C, T_A[C, C]]
case class CC_B[D](a: D, b: D, c: D) extends T_A[D, T_A[D, D]]
case class CC_C(a: (CC_B[Char],Boolean)) extends T_A[CC_B[CC_B[(Byte,Int)]], T_A[CC_B[CC_B[(Byte,Int)]], CC_B[CC_B[(Byte,Int)]]]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, _, _)) => 1 
  case CC_B(_, _, _) => 2 
}
}