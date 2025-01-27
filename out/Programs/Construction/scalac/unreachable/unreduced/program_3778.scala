package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_A[Char]) extends T_A[T_B]
case class CC_B[B](a: (T_B,Int), b: T_A[B], c: B) extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: Int, c: Char) extends T_A[T_B]
case class CC_D[C](a: CC_C) extends T_B

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_), _, _) => 0 
  case CC_C(CC_B((_,_), _, _), _, _) => 1 
  case CC_C(CC_C(CC_A(_), _, 'x'), _, _) => 2 
  case CC_C(CC_C(CC_A(_), _, _), _, _) => 3 
  case CC_C(CC_C(CC_B(_, _, _), _, 'x'), _, _) => 4 
  case CC_C(CC_C(CC_B(_, _, _), _, _), _, _) => 5 
  case CC_C(CC_C(CC_C(_, _, _), _, 'x'), _, _) => 6 
  case CC_C(CC_C(CC_C(_, _, _), _, _), _, _) => 7 
}
}