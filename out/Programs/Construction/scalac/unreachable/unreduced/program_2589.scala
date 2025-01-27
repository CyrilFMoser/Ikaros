package Program_16 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: T_B, b: C) extends T_A[C, T_B]
case class CC_B(a: T_B, b: Char, c: T_A[(T_B,T_B), T_B]) extends T_B
case class CC_C(a: T_A[T_B, T_B], b: T_A[T_A[CC_B, CC_B], Int], c: T_A[Int, Boolean]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, CC_A(CC_B(_, _, _), (_,_))) => 0 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, CC_A(CC_B(_, _, _), (_,_))) => 1 
  case CC_B(CC_B(CC_B(_, _, _), _, _), _, CC_A(CC_C(_, _, _), (_,_))) => 2 
  case CC_B(CC_B(CC_C(_, _, _), _, _), _, CC_A(CC_C(_, _, _), (_,_))) => 3 
  case CC_B(CC_C(_, _, _), _, CC_A(CC_C(_, _, _), (_,_))) => 4 
  case CC_C(_, _, _) => 5 
}
}
// This is not matched: CC_B(CC_C(_, _, _), _, CC_A(CC_B(_, _, _), (_,_)))