package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: (T_B,T_A[T_B]), b: T_A[T_A[B]], c: T_B) extends T_A[T_A[T_B]]
case class CC_B(a: CC_A[CC_A[T_B]], b: T_A[T_A[T_B]], c: T_B) extends T_A[T_A[T_B]]
case class CC_C(a: Int) extends T_A[T_A[T_B]]
case class CC_D(a: CC_C) extends T_B
case class CC_E(a: T_A[CC_D], b: CC_B, c: T_B) extends T_B
case class CC_F(a: CC_B, b: (CC_C,CC_B), c: Char) extends T_B

val v_a: T_A[T_A[T_B]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_D(_)) => 1 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_E(_, _, _)) => 2 
  case CC_B(CC_A(_, _, _), CC_A(_, _, _), CC_F(_, _, _)) => 3 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), CC_D(_)) => 4 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), CC_E(_, _, _)) => 5 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), CC_F(_, _, _)) => 6 
  case CC_B(CC_A(_, _, _), CC_C(_), CC_D(_)) => 7 
  case CC_B(CC_A(_, _, _), CC_C(_), CC_E(_, _, _)) => 8 
  case CC_B(CC_A(_, _, _), CC_C(_), CC_F(_, _, _)) => 9 
  case CC_C(12) => 10 
  case CC_C(_) => 11 
}
}