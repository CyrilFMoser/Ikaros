package Program_13 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: T_A[C, Boolean], c: T_A[C, Boolean]) extends T_A[C, Boolean]
case class CC_B(a: CC_A[T_A[Int, Int]], b: T_A[CC_A[Boolean], Byte], c: T_A[CC_A[Char], T_A[Int, Char]]) extends T_A[CC_A[T_A[Char, Byte]], Boolean]

val v_a: T_A[CC_A[T_A[Char, Byte]], Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), CC_A(CC_A(_, _, _), _, _), _) => 0 
  case CC_A(CC_A(_, _, _), CC_A(CC_B(_, _, _), _, _), _) => 1 
  case CC_A(CC_A(_, _, _), CC_B(CC_A(_, _, _), _, _), _) => 2 
  case CC_A(CC_B(CC_A(_, _, _), _, _), CC_A(CC_A(_, _, _), _, _), _) => 3 
  case CC_A(CC_B(CC_A(_, _, _), _, _), CC_A(CC_B(_, _, _), _, _), _) => 4 
  case CC_A(CC_B(CC_A(_, _, _), _, _), CC_B(CC_A(_, _, _), _, _), _) => 5 
  case CC_B(CC_A(_, CC_A(_, _, _), CC_A(_, _, _)), _, _) => 6 
}
}