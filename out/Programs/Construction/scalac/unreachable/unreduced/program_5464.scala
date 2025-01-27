package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, Boolean], b: T_A[C, C], c: Boolean) extends T_A[C, Boolean]
case class CC_B[D](a: D, b: D, c: Char) extends T_A[D, Boolean]

val v_a: T_A[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_, _, _), _, _), _, _) => 1 
  case CC_A(CC_B(_, 'x', _), _, _) => 2 
  case CC_A(CC_B(_, _, _), _, _) => 3 
  case CC_B(_, _, _) => 4 
}
}