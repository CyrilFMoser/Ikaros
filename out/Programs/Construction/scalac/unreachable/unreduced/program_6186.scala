package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C](a: C, b: T_B) extends T_A[T_B, C]
case class CC_B[D](a: T_A[T_B, T_B]) extends T_A[T_B, T_B]
case class CC_C(a: Char, b: T_A[T_B, T_B]) extends T_B
case class CC_D(a: T_B) extends T_B
case class CC_E(a: T_A[CC_B[(Char,Int)], CC_D], b: CC_B[CC_B[CC_D]], c: CC_A[T_A[T_B, T_B]]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(CC_C(_, _), _)) => 0 
  case CC_C(_, CC_A(CC_D(_), _)) => 1 
  case CC_C(_, CC_B(_)) => 2 
  case CC_D(CC_C(_, _)) => 3 
  case CC_D(CC_D(CC_C(_, _))) => 4 
  case CC_D(CC_D(CC_D(_))) => 5 
  case CC_D(CC_D(CC_E(_, _, _))) => 6 
  case CC_D(CC_E(_, _, _)) => 7 
  case CC_E(_, _, _) => 8 
}
}
// This is not matched: CC_C(_, CC_A(CC_E(_, _, _), _))