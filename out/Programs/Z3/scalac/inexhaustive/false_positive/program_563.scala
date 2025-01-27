package Program_31 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: B) extends T_A[B]
case class CC_B(a: T_A[T_B]) extends T_A[T_B]
case class CC_C(a: T_A[T_B], b: T_B, c: CC_A[Int]) extends T_B
case class CC_D[C](a: T_A[C], b: T_A[T_B], c: C) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_), _) => 0 
  case CC_D(_, CC_B(_), _) => 1 
  case CC_D(_, _, _) => 2 
  case CC_D(CC_A(_), _, _) => 3 
  case CC_D(CC_A(_), CC_B(_), _) => 4 
  case CC_D(CC_B(_), _, _) => 5 
  case CC_D(CC_A(_), CC_A(_), _) => 6 
  case CC_C(CC_A(_), _, CC_A(_)) => 7 
  case CC_C(CC_A(_), _, _) => 8 
  case CC_C(CC_A(_), CC_C(_, _, _), _) => 9 
  case CC_C(CC_B(_), CC_C(_, _, _), CC_A(_)) => 10 
  case CC_C(_, _, CC_A(_)) => 11 
  case CC_C(CC_A(_), CC_D(_, _, _), CC_A(_)) => 12 
  case CC_C(CC_B(_), CC_C(_, _, _), _) => 13 
  case CC_C(CC_A(_), CC_D(_, _, _), _) => 14 
  case CC_C(_, _, _) => 15 
  case CC_C(CC_A(_), CC_C(_, _, _), CC_A(_)) => 16 
  case CC_C(_, CC_C(_, _, _), CC_A(_)) => 17 
  case CC_C(CC_B(_), _, CC_A(_)) => 18 
  case CC_C(CC_B(_), _, _) => 19 
  case CC_C(_, CC_D(_, _, _), CC_A(_)) => 20 
  case CC_C(CC_B(_), CC_D(_, _, _), CC_A(_)) => 21 
  case CC_C(_, CC_C(_, _, _), _) => 22 
}
}
// This is not matched: (CC_D T_B Wildcard Wildcard Wildcard T_B)
// This is not matched: (CC_D T_B Wildcard Wildcard Wildcard T_B)