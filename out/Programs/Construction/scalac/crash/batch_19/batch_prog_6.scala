package Program_6 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: D, c: T_A[D, T_A[D, D]]) extends T_A[D, C]

val v_a: CC_A[Byte, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _, _), 12, CC_A(_, _, _)), 12, CC_A(CC_A(_, _, _), _, _)) => 0 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), 12, CC_A(CC_A(_, _, _), _, _)) => 1 
  case CC_A(CC_A(CC_A(_, _, _), 12, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 2 
  case CC_A(CC_A(CC_A(_, _, _), _, CC_A(_, _, _)), _, CC_A(CC_A(_, _, _), _, _)) => 3 
}
}