package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A(a: T_B[T_B[(Boolean,Char)]], b: T_B[T_B[Int]], c: T_A[T_A[Int]]) extends T_A[T_B[Char]]
case class CC_B(a: Int, b: CC_A, c: T_A[T_B[(Boolean,Int)]]) extends T_A[T_B[Char]]
case class CC_C(a: T_A[T_B[Char]]) extends T_A[T_B[Char]]
case class CC_D[C](a: T_A[T_B[Char]], b: CC_C, c: Boolean) extends T_B[C]
case class CC_E[D]() extends T_B[D]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(CC_D(_, _, _), CC_D(_, _, _), _), CC_C(CC_A(_, _, _)), _) => 0 
  case CC_D(CC_A(CC_D(_, _, _), CC_E(), _), CC_C(CC_A(_, _, _)), _) => 1 
  case CC_D(CC_A(CC_E(), CC_D(_, _, _), _), CC_C(CC_A(_, _, _)), _) => 2 
  case CC_D(CC_A(CC_E(), CC_E(), _), CC_C(CC_A(_, _, _)), _) => 3 
  case CC_D(CC_B(_, CC_A(_, _, _), _), CC_C(CC_A(_, _, _)), _) => 4 
  case CC_D(CC_C(CC_A(_, _, _)), CC_C(CC_A(_, _, _)), _) => 5 
  case CC_D(CC_C(CC_B(_, _, _)), CC_C(CC_A(_, _, _)), _) => 6 
  case CC_D(CC_C(CC_C(_)), CC_C(CC_A(_, _, _)), _) => 7 
  case CC_D(CC_A(CC_D(_, _, _), CC_D(_, _, _), _), CC_C(CC_B(_, _, _)), _) => 8 
  case CC_D(CC_A(CC_D(_, _, _), CC_E(), _), CC_C(CC_B(_, _, _)), _) => 9 
  case CC_D(CC_A(CC_E(), CC_D(_, _, _), _), CC_C(CC_B(_, _, _)), _) => 10 
  case CC_D(CC_A(CC_E(), CC_E(), _), CC_C(CC_B(_, _, _)), _) => 11 
  case CC_D(CC_B(_, CC_A(_, _, _), _), CC_C(CC_B(_, _, _)), _) => 12 
  case CC_D(CC_C(CC_A(_, _, _)), CC_C(CC_B(_, _, _)), _) => 13 
  case CC_D(CC_C(CC_B(_, _, _)), CC_C(CC_B(_, _, _)), _) => 14 
  case CC_D(CC_C(CC_C(_)), CC_C(CC_B(_, _, _)), _) => 15 
  case CC_D(CC_A(CC_D(_, _, _), CC_D(_, _, _), _), CC_C(CC_C(_)), _) => 16 
  case CC_D(CC_A(CC_D(_, _, _), CC_E(), _), CC_C(CC_C(_)), _) => 17 
  case CC_D(CC_A(CC_E(), CC_D(_, _, _), _), CC_C(CC_C(_)), _) => 18 
  case CC_D(CC_A(CC_E(), CC_E(), _), CC_C(CC_C(_)), _) => 19 
  case CC_D(CC_B(_, CC_A(_, _, _), _), CC_C(CC_C(_)), _) => 20 
  case CC_D(CC_C(CC_A(_, _, _)), CC_C(CC_C(_)), _) => 21 
  case CC_D(CC_C(CC_B(_, _, _)), CC_C(CC_C(_)), _) => 22 
  case CC_D(CC_C(CC_C(_)), CC_C(CC_C(_)), _) => 23 
  case CC_E() => 24 
}
}