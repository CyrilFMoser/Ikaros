package Program_31 

package Program_15 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: T_A, c: T_A) extends T_A
case class CC_B[A]() extends T_A
case class CC_C(a: T_A, b: Int, c: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 1 
  case CC_A(CC_B(), CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_C(_, _, _), _) => 3 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _), _) => 4 
  case CC_A(_, CC_B(), CC_A(_, _, _)) => 5 
  case CC_A(CC_B(), CC_B(), CC_A(_, _, _)) => 6 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_B()) => 7 
  case CC_A(_, CC_B(), _) => 8 
  case CC_A(CC_C(_, _, _), _, _) => 9 
  case CC_A(CC_A(_, _, _), CC_B(), CC_C(_, _, _)) => 10 
  case CC_A(_, _, _) => 11 
  case CC_A(CC_C(_, _, _), _, CC_A(_, _, _)) => 12 
  case CC_A(CC_C(_, _, _), CC_B(), CC_C(_, _, _)) => 13 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 14 
  case CC_A(CC_B(), CC_B(), CC_C(_, _, _)) => 15 
  case CC_A(_, _, CC_B()) => 16 
  case CC_A(CC_A(_, _, _), CC_B(), CC_A(_, _, _)) => 17 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_B()) => 18 
  case CC_A(_, CC_A(_, _, _), CC_C(_, _, _)) => 19 
  case CC_A(CC_C(_, _, _), _, CC_C(_, _, _)) => 20 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_C(_, _, _)) => 21 
  case CC_A(_, CC_C(_, _, _), CC_A(_, _, _)) => 22 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 23 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 24 
  case CC_A(CC_C(_, _, _), _, CC_B()) => 25 
  case CC_A(_, _, CC_A(_, _, _)) => 26 
  case CC_A(CC_B(), CC_A(_, _, _), CC_C(_, _, _)) => 27 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 28 
  case CC_A(_, CC_A(_, _, _), _) => 29 
  case CC_A(CC_B(), CC_A(_, _, _), CC_B()) => 30 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _), CC_C(_, _, _)) => 31 
  case CC_A(CC_C(_, _, _), CC_B(), _) => 32 
  case CC_A(CC_B(), _, CC_C(_, _, _)) => 33 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 34 
  case CC_A(CC_B(), _, CC_B()) => 35 
  case CC_A(CC_A(_, _, _), CC_B(), CC_B()) => 36 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), _) => 37 
  case CC_A(CC_A(_, _, _), CC_C(_, _, _), CC_A(_, _, _)) => 38 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _), CC_B()) => 39 
  case CC_A(_, CC_B(), CC_B()) => 40 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), CC_A(_, _, _)) => 41 
  case CC_C(CC_C(_, _, _), _, _) => 42 
  case CC_C(CC_B(), 12, CC_A(_, _, _)) => 43 
  case CC_C(_, _, _) => 44 
  case CC_C(CC_A(_, _, _), _, CC_A(_, _, _)) => 45 
  case CC_C(CC_C(_, _, _), _, CC_A(_, _, _)) => 46 
  case CC_C(CC_B(), _, _) => 47 
}
}
// This is not matched: (CC_B T_A T_A)
// This is not matched: (CC_B T_A T_A)