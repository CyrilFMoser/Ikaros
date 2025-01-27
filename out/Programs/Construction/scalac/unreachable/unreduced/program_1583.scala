package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[C, T_A[C, C]]
case class CC_B(a: T_B, b: T_B, c: T_B) extends T_B
case class CC_C(a: T_A[CC_A[CC_B], CC_B]) extends T_B
case class CC_D(a: T_B, b: Byte) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 0 
  case CC_B(CC_C(_), _, CC_B(_, _, _)) => 1 
  case CC_B(CC_D(_, _), _, CC_B(_, _, _)) => 2 
  case CC_B(CC_B(_, _, _), _, CC_C(_)) => 3 
  case CC_B(CC_C(_), _, CC_C(_)) => 4 
  case CC_B(CC_D(_, _), _, CC_C(_)) => 5 
  case CC_B(CC_B(_, _, _), _, CC_D(_, _)) => 6 
  case CC_B(CC_C(_), _, CC_D(_, _)) => 7 
  case CC_B(CC_D(_, _), _, CC_D(_, _)) => 8 
  case CC_D(CC_B(_, _, _), _) => 9 
  case CC_D(CC_C(_), _) => 10 
  case CC_D(CC_D(_, _), _) => 11 
}
}
// This is not matched: CC_C(_)