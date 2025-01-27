package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A(a: Byte) extends T_A[T_A[((Char,Int),Int), T_B[Char]], Int]
case class CC_B(a: T_A[((Int,Char),CC_A), T_A[CC_A, CC_A]], b: T_B[T_A[CC_A, (Int,Char)]], c: T_A[Char, CC_A]) extends T_A[T_A[((Char,Int),Int), T_B[Char]], Int]
case class CC_C[D](a: D, b: T_B[D], c: D) extends T_B[D]
case class CC_D[E](a: CC_B) extends T_B[E]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_C('x', CC_C(_, _, _), 'x') => 0 
  case CC_C('x', CC_C(_, _, _), _) => 1 
  case CC_C(_, CC_C(_, _, _), 'x') => 2 
  case CC_C(_, CC_C(_, _, _), _) => 3 
  case CC_C('x', CC_D(CC_B(_, _, _)), 'x') => 4 
  case CC_C('x', CC_D(CC_B(_, _, _)), _) => 5 
  case CC_C(_, CC_D(CC_B(_, _, _)), 'x') => 6 
  case CC_C(_, CC_D(CC_B(_, _, _)), _) => 7 
  case CC_D(CC_B(_, CC_C(_, _, _), _)) => 8 
  case CC_D(CC_B(_, CC_D(_), _)) => 9 
}
}