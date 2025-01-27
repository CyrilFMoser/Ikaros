package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A(a: T_A[(T_B,T_B), T_A[T_B, T_B]], b: T_A[T_B, Char]) extends T_A[T_B, Char]
case class CC_B[C](a: C) extends T_A[T_B, Char]
case class CC_C(a: T_A[T_B, Char]) extends T_B
case class CC_D(a: T_A[CC_C, T_A[T_B, Char]], b: CC_A) extends T_B
case class CC_E[D](a: D, b: T_B, c: Boolean) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _)) => 0 
  case CC_C(CC_B(_)) => 1 
  case CC_D(_, CC_A(_, CC_A(_, _))) => 2 
  case CC_D(_, CC_A(_, CC_B(_))) => 3 
  case CC_E(_, CC_C(_), _) => 4 
  case CC_E(_, CC_D(_, _), _) => 5 
  case CC_E(_, CC_E(_, _, _), _) => 6 
}
}