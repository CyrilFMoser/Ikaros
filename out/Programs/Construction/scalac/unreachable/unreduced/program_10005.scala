package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: Int, b: T_A[T_B], c: T_A[Boolean]) extends T_A[T_B]
case class CC_B(a: CC_A) extends T_A[T_B]
case class CC_C(a: T_B, b: T_B, c: CC_A) extends T_A[T_B]
case class CC_D(a: T_A[T_B]) extends T_B

val v_a: T_A[T_B] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, CC_B(CC_A(_, _, _)), _) => 1 
  case CC_A(_, CC_C(CC_D(_), _, CC_A(_, _, _)), _) => 2 
  case CC_B(_) => 3 
  case CC_C(_, CC_D(CC_A(_, _, _)), CC_A(12, CC_A(_, _, _), _)) => 4 
  case CC_C(_, CC_D(CC_A(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 5 
  case CC_C(_, CC_D(CC_A(_, _, _)), CC_A(12, CC_B(_), _)) => 6 
  case CC_C(_, CC_D(CC_A(_, _, _)), CC_A(_, CC_B(_), _)) => 7 
  case CC_C(_, CC_D(CC_A(_, _, _)), CC_A(12, CC_C(_, _, _), _)) => 8 
  case CC_C(_, CC_D(CC_A(_, _, _)), CC_A(_, CC_C(_, _, _), _)) => 9 
  case CC_C(_, CC_D(CC_B(_)), CC_A(12, CC_A(_, _, _), _)) => 10 
  case CC_C(_, CC_D(CC_B(_)), CC_A(_, CC_A(_, _, _), _)) => 11 
  case CC_C(_, CC_D(CC_B(_)), CC_A(12, CC_B(_), _)) => 12 
  case CC_C(_, CC_D(CC_B(_)), CC_A(_, CC_B(_), _)) => 13 
  case CC_C(_, CC_D(CC_B(_)), CC_A(12, CC_C(_, _, _), _)) => 14 
  case CC_C(_, CC_D(CC_B(_)), CC_A(_, CC_C(_, _, _), _)) => 15 
  case CC_C(_, CC_D(CC_C(_, _, _)), CC_A(12, CC_A(_, _, _), _)) => 16 
  case CC_C(_, CC_D(CC_C(_, _, _)), CC_A(_, CC_A(_, _, _), _)) => 17 
  case CC_C(_, CC_D(CC_C(_, _, _)), CC_A(12, CC_B(_), _)) => 18 
  case CC_C(_, CC_D(CC_C(_, _, _)), CC_A(_, CC_B(_), _)) => 19 
  case CC_C(_, CC_D(CC_C(_, _, _)), CC_A(12, CC_C(_, _, _), _)) => 20 
}
}
// This is not matched: CC_C(_, CC_D(CC_C(_, _, _)), CC_A(_, CC_C(_, _, _), _))