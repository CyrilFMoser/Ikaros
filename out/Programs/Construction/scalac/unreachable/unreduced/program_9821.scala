package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B, b: T_B) extends T_A[T_B]
case class CC_B(a: T_B) extends T_A[T_B]
case class CC_C(a: T_A[CC_A]) extends T_A[T_B]
case class CC_D(a: CC_B, b: T_A[T_B], c: CC_C) extends T_B
case class CC_E(a: T_A[T_B], b: Int, c: Int) extends T_B
case class CC_F(a: (CC_B,CC_B), b: T_A[CC_B], c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_D(_, _, _)), _, CC_C(_)) => 0 
  case CC_D(CC_B(CC_E(_, _, _)), _, CC_C(_)) => 1 
  case CC_D(CC_B(CC_F(_, _, _)), _, CC_C(_)) => 2 
  case CC_E(CC_A(CC_D(_, _, _), _), _, _) => 3 
  case CC_E(CC_A(CC_E(_, _, _), _), _, _) => 4 
  case CC_E(CC_B(CC_D(_, _, _)), _, _) => 5 
  case CC_E(CC_B(CC_E(_, _, _)), _, _) => 6 
  case CC_E(CC_B(CC_F(_, _, _)), _, _) => 7 
  case CC_E(CC_C(_), _, _) => 8 
  case CC_F((CC_B(_),CC_B(_)), _, _) => 9 
}
}
// This is not matched: CC_E(CC_A(CC_F(_, _, _), _), _, _)