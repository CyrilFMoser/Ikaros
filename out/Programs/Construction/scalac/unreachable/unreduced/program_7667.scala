package Program_9 

object Test {
sealed trait T_A[A, B]
case class CC_A[C](a: T_A[Char, C], b: C, c: T_A[C, C]) extends T_A[Char, C]
case class CC_B[D](a: T_A[Char, D]) extends T_A[Char, D]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), 12, _), _, _) => 0 
  case CC_A(CC_A(CC_B(_), 12, _), _, _) => 1 
  case CC_A(CC_A(CC_A(_, _, _), _, _), _, _) => 2 
  case CC_A(CC_A(CC_B(_), _, _), _, _) => 3 
  case CC_A(CC_B(CC_A(_, _, _)), _, _) => 4 
  case CC_A(CC_B(CC_B(_)), _, _) => 5 
  case CC_B(CC_A(CC_A(_, _, _), _, _)) => 6 
  case CC_B(CC_A(CC_B(_), _, _)) => 7 
  case CC_B(CC_B(_)) => 8 
}
}