package Program_15 

package Program_7 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: A, b: A) extends T_A
case class CC_B(a: CC_A[T_B]) extends T_A
case class CC_C(a: T_A, b: T_A, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_) => 1 
  case CC_C(CC_B(_), CC_B(_), CC_B(_)) => 2 
  case CC_C(CC_B(_), _, CC_C(_, _, _)) => 3 
  case CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_B(_)) => 4 
  case CC_C(CC_A(_, _), _, CC_B(_)) => 5 
  case CC_C(CC_A(_, _), CC_B(_), CC_C(_, _, _)) => 6 
  case CC_C(_, CC_C(_, _, _), CC_B(_)) => 7 
  case CC_C(_, CC_B(_), CC_B(_)) => 8 
  case CC_C(CC_C(_, _, _), _, CC_A(_, _)) => 9 
  case CC_C(CC_B(_), CC_A(_, _), CC_C(_, _, _)) => 10 
  case CC_C(CC_A(_, _), _, _) => 11 
  case CC_C(_, CC_B(_), _) => 12 
  case CC_C(CC_C(_, _, _), CC_B(_), CC_C(_, _, _)) => 13 
  case CC_C(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _)) => 14 
  case CC_C(CC_A(_, _), _, CC_C(_, _, _)) => 15 
  case CC_C(CC_C(_, _, _), CC_B(_), CC_B(_)) => 16 
  case CC_C(CC_C(_, _, _), CC_A(_, _), CC_A(_, _)) => 17 
  case CC_C(CC_B(_), _, _) => 18 
  case CC_C(CC_A(_, _), CC_A(_, _), CC_A(_, _)) => 19 
  case CC_C(_, CC_C(_, _, _), CC_A(_, _)) => 20 
  case CC_C(CC_C(_, _, _), _, CC_C(_, _, _)) => 21 
  case CC_C(CC_C(_, _, _), CC_A(_, _), _) => 22 
  case CC_C(CC_C(_, _, _), CC_A(_, _), CC_C(_, _, _)) => 23 
  case CC_C(CC_B(_), CC_C(_, _, _), CC_A(_, _)) => 24 
  case CC_C(CC_A(_, _), CC_B(_), CC_A(_, _)) => 25 
  case CC_C(CC_B(_), CC_C(_, _, _), _) => 26 
  case CC_C(CC_A(_, _), CC_C(_, _, _), CC_B(_)) => 27 
  case CC_C(CC_A(_, _), CC_C(_, _, _), CC_A(_, _)) => 28 
  case CC_C(_, CC_C(_, _, _), CC_C(_, _, _)) => 29 
  case CC_C(CC_B(_), CC_A(_, _), _) => 30 
  case CC_C(CC_B(_), _, CC_A(_, _)) => 31 
  case CC_C(CC_C(_, _, _), _, CC_B(_)) => 32 
  case CC_C(CC_B(_), _, CC_B(_)) => 33 
  case CC_C(_, CC_A(_, _), _) => 34 
  case CC_C(CC_A(_, _), CC_A(_, _), CC_B(_)) => 35 
  case CC_C(_, CC_A(_, _), CC_A(_, _)) => 36 
  case CC_C(CC_C(_, _, _), CC_B(_), _) => 37 
  case CC_C(CC_C(_, _, _), CC_C(_, _, _), _) => 38 
  case CC_C(_, _, CC_B(_)) => 39 
  case CC_C(CC_B(_), CC_B(_), _) => 40 
  case CC_C(CC_B(_), CC_C(_, _, _), CC_C(_, _, _)) => 41 
  case CC_C(_, CC_C(_, _, _), _) => 42 
  case CC_C(CC_A(_, _), CC_A(_, _), _) => 43 
  case CC_C(_, CC_B(_), CC_A(_, _)) => 44 
  case CC_C(CC_A(_, _), CC_B(_), CC_B(_)) => 45 
  case CC_C(CC_B(_), CC_A(_, _), CC_B(_)) => 46 
  case CC_C(_, CC_B(_), CC_C(_, _, _)) => 47 
  case CC_C(CC_B(_), CC_A(_, _), CC_A(_, _)) => 48 
  case CC_C(CC_A(_, _), CC_C(_, _, _), _) => 49 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Int Wildcard (T_A Int (T_A Int Int)))