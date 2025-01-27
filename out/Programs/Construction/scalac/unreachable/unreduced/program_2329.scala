package Program_10 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_B[C], c: T_B[C]) extends T_A[C]
case class CC_B[D](a: T_A[D], b: T_A[D], c: T_A[D]) extends T_A[D]
case class CC_C[E, F]() extends T_A[E]
case class CC_D(a: T_A[(Char,Char)], b: Char, c: CC_A[CC_A[Boolean]]) extends T_B[CC_C[T_A[Boolean], CC_A[Char]]]
case class CC_E() extends T_B[CC_C[T_A[Boolean], CC_A[Char]]]
case class CC_F(a: T_A[CC_B[CC_D]], b: T_A[CC_D], c: CC_A[CC_E]) extends T_B[CC_C[T_A[Boolean], CC_A[Char]]]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, _) => 1 
  case CC_A(CC_A(CC_C(), _, _), _, _) => 2 
  case CC_A(CC_B(CC_A(_, _, _), CC_A(_, _, _), _), _, _) => 3 
  case CC_A(CC_B(CC_A(_, _, _), CC_B(_, _, _), _), _, _) => 4 
  case CC_A(CC_B(CC_A(_, _, _), CC_C(), _), _, _) => 5 
  case CC_A(CC_B(CC_B(_, _, _), CC_A(_, _, _), _), _, _) => 6 
  case CC_A(CC_B(CC_B(_, _, _), CC_B(_, _, _), _), _, _) => 7 
  case CC_A(CC_B(CC_B(_, _, _), CC_C(), _), _, _) => 8 
  case CC_A(CC_B(CC_C(), CC_A(_, _, _), _), _, _) => 9 
  case CC_A(CC_B(CC_C(), CC_B(_, _, _), _), _, _) => 10 
  case CC_A(CC_B(CC_C(), CC_C(), _), _, _) => 11 
  case CC_A(CC_C(), _, _) => 12 
  case CC_B(_, _, _) => 13 
  case CC_C() => 14 
}
}