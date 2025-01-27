package Program_27 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[T_A[C, C], C]) extends T_A[T_A[C, C], C]
case class CC_B(a: T_A[Boolean, T_A[Byte, Int]], b: T_A[T_A[Byte, Int], CC_A[(Byte,Char)]], c: (CC_A[Char],Int)) extends T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]]

val v_a: T_A[T_A[CC_A[Int], CC_A[Int]], CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_))) => 0 
  case CC_A(CC_A(CC_B(_, _, _))) => 1 
  case CC_A(CC_B(_, _, (_,_))) => 2 
  case CC_B(_, _, (CC_A(_),_)) => 3 
}
}