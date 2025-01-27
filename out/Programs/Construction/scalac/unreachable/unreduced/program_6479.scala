package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: Byte, c: T_A[C]) extends T_A[C]
case class CC_B(a: T_A[CC_A[Int]]) extends T_A[CC_A[Int]]
case class CC_C() extends T_A[CC_A[Int]]
case class CC_D(a: Byte, b: T_A[T_B[CC_B]]) extends T_B[T_A[Char]]
case class CC_E() extends T_B[T_A[Char]]
case class CC_F() extends T_B[T_A[Char]]

val v_a: T_A[T_B[T_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D(_, CC_A(_, _, _)), _, CC_A(CC_D(_, _), 0, _)) => 0 
  case CC_A(CC_D(_, CC_A(_, _, _)), _, CC_A(CC_E(), 0, _)) => 1 
  case CC_A(CC_D(_, CC_A(_, _, _)), _, CC_A(CC_F(), 0, _)) => 2 
  case CC_A(CC_D(_, CC_A(_, _, _)), _, CC_A(CC_D(_, _), _, _)) => 3 
  case CC_A(CC_D(_, CC_A(_, _, _)), _, CC_A(CC_E(), _, _)) => 4 
  case CC_A(CC_D(_, CC_A(_, _, _)), _, CC_A(CC_F(), _, _)) => 5 
  case CC_A(CC_E(), _, CC_A(CC_D(_, _), 0, _)) => 6 
  case CC_A(CC_E(), _, CC_A(CC_E(), 0, _)) => 7 
  case CC_A(CC_E(), _, CC_A(CC_F(), 0, _)) => 8 
  case CC_A(CC_E(), _, CC_A(CC_D(_, _), _, _)) => 9 
  case CC_A(CC_E(), _, CC_A(CC_E(), _, _)) => 10 
  case CC_A(CC_E(), _, CC_A(CC_F(), _, _)) => 11 
  case CC_A(CC_F(), _, CC_A(CC_D(_, _), 0, _)) => 12 
  case CC_A(CC_F(), _, CC_A(CC_E(), 0, _)) => 13 
  case CC_A(CC_F(), _, CC_A(CC_F(), 0, _)) => 14 
  case CC_A(CC_F(), _, CC_A(CC_D(_, _), _, _)) => 15 
  case CC_A(CC_F(), _, CC_A(CC_E(), _, _)) => 16 
  case CC_A(CC_F(), _, CC_A(CC_F(), _, _)) => 17 
}
}