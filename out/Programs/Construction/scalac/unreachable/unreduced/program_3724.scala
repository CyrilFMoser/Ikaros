package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: (T_A[Char],T_B), b: Int) extends T_A[Char]
case class CC_B(a: T_B, b: T_A[CC_A], c: T_A[T_A[T_B]]) extends T_A[Char]
case class CC_C(a: T_A[Char], b: Boolean) extends T_A[Char]
case class CC_D(a: CC_A, b: CC_C) extends T_B
case class CC_E[B](a: CC_B) extends T_B
case class CC_F[C](a: CC_E[C], b: C, c: CC_E[CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(CC_A((_,_), _), CC_C(_, _)) => 0 
  case CC_E(CC_B(CC_D(_, _), _, _)) => 1 
  case CC_E(CC_B(CC_E(_), _, _)) => 2 
  case CC_E(CC_B(CC_F(_, _, _), _, _)) => 3 
}
}
// This is not matched: CC_F(_, _, CC_E(CC_B(_, _, _)))