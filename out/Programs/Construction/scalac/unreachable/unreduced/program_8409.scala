package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C]) extends T_A[C, T_A[Char, C]]
case class CC_B[D](a: T_A[T_A[CC_A[Char], CC_A[Char]], T_A[Char, T_A[CC_A[Char], CC_A[Char]]]], b: T_A[D, T_A[Char, D]], c: Char) extends T_A[D, T_A[Char, D]]

val v_a: T_A[Int, T_A[Char, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, 'x') => 1 
  case CC_B(_, _, _) => 2 
}
}