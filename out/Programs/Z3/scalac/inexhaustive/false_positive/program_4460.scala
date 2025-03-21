package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
case class CC_A[B]() extends T_A[(Int,Boolean)]
case class CC_B[C](a: T_A[C], b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_C(a: Int, b: CC_B[Char]) extends T_A[(Int,Boolean)]

val v_a: T_A[(Int,Boolean)] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(12, CC_B(_, _, _)) => 1 
  case CC_C(_, CC_B(_, _, _)) => 2 
  case CC_B(_, CC_B(_, _, _), CC_C(_, _)) => 3 
  case CC_B(_, CC_A(), _) => 4 
  case CC_B(CC_A(), _, CC_B(_, _, _)) => 5 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 6 
  case CC_B(CC_A(), CC_B(_, _, _), _) => 7 
  case CC_B(CC_A(), CC_A(), CC_A()) => 8 
  case CC_B(CC_C(_, _), CC_B(_, _, _), CC_A()) => 9 
  case CC_B(CC_A(), CC_B(_, _, _), CC_B(_, _, _)) => 10 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 11 
  case CC_B(CC_C(_, _), _, CC_C(_, _)) => 12 
  case CC_B(CC_C(_, _), CC_C(_, _), CC_B(_, _, _)) => 13 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 14 
  case CC_B(CC_C(_, _), CC_C(_, _), CC_C(_, _)) => 15 
  case CC_B(CC_B(_, _, _), CC_A(), CC_A()) => 16 
  case CC_B(_, CC_C(_, _), CC_B(_, _, _)) => 17 
  case CC_B(CC_A(), _, CC_A()) => 18 
  case CC_B(CC_B(_, _, _), _, _) => 19 
  case CC_B(CC_A(), CC_B(_, _, _), CC_A()) => 20 
  case CC_B(CC_C(_, _), CC_A(), _) => 21 
  case CC_B(CC_A(), _, _) => 22 
  case CC_B(_, CC_C(_, _), CC_C(_, _)) => 23 
  case CC_B(CC_C(_, _), CC_A(), CC_B(_, _, _)) => 24 
  case CC_B(CC_B(_, _, _), CC_C(_, _), _) => 25 
  case CC_B(CC_B(_, _, _), _, CC_C(_, _)) => 26 
  case CC_B(CC_A(), CC_C(_, _), CC_B(_, _, _)) => 27 
  case CC_B(CC_A(), CC_C(_, _), _) => 28 
  case CC_B(_, CC_A(), CC_C(_, _)) => 29 
  case CC_B(CC_B(_, _, _), CC_A(), CC_C(_, _)) => 30 
  case CC_B(CC_C(_, _), CC_B(_, _, _), _) => 31 
  case CC_B(_, _, CC_A()) => 32 
  case CC_B(_, _, _) => 33 
  case CC_B(_, CC_C(_, _), _) => 34 
  case CC_B(_, CC_C(_, _), CC_A()) => 35 
  case CC_B(CC_C(_, _), CC_B(_, _, _), CC_B(_, _, _)) => 36 
}
}
// This is not matched: (CC_A Boolean (T_A (Tuple Int Boolean)))
// This is not matched: (CC_A Boolean (T_A (Tuple Int Boolean)))