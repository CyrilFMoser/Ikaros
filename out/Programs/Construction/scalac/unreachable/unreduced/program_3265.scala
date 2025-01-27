package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[C, C], b: C, c: T_A[Boolean, C]) extends T_A[Boolean, C]
case class CC_B[D](a: T_A[Boolean, D], b: Char, c: D) extends T_A[Boolean, D]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, 0, _)) => 0 
  case CC_A(_, _, CC_A(_, _, _)) => 1 
  case CC_A(_, _, CC_B(CC_A(_, _, _), 'x', _)) => 2 
  case CC_A(_, _, CC_B(CC_A(_, _, _), _, _)) => 3 
  case CC_A(_, _, CC_B(CC_B(_, _, _), 'x', _)) => 4 
  case CC_A(_, _, CC_B(CC_B(_, _, _), _, _)) => 5 
  case CC_B(_, _, _) => 6 
}
}