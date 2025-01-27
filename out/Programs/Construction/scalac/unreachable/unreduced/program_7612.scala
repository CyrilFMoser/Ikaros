package Program_1 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: C) extends T_A[C, T_A[C, C]]
case class CC_B[D]() extends T_A[D, T_A[D, D]]
case class CC_C(a: Char, b: T_A[T_A[Boolean, Char], T_A[T_A[Boolean, Char], T_A[Boolean, Char]]], c: T_A[CC_B[Int], T_A[CC_B[Int], CC_B[Int]]]) extends T_A[Char, T_A[Char, Char]]

val v_a: T_A[Char, T_A[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
  case CC_C('x', CC_A(_), CC_A(CC_B())) => 2 
  case CC_C('x', CC_B(), CC_A(CC_B())) => 3 
  case CC_C(_, CC_A(_), CC_A(CC_B())) => 4 
  case CC_C(_, CC_B(), CC_A(CC_B())) => 5 
  case CC_C('x', CC_A(_), CC_B()) => 6 
  case CC_C('x', CC_B(), CC_B()) => 7 
  case CC_C(_, CC_A(_), CC_B()) => 8 
  case CC_C(_, CC_B(), CC_B()) => 9 
}
}