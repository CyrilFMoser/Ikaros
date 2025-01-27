package Program_15 

package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[Char]
case class CC_B(a: T_A[Char], b: T_A[Char], c: T_A[Char]) extends T_A[Char]
case class CC_C(a: T_A[Char], b: CC_B) extends T_A[Char]
case class CC_D[E](a: CC_A[E], b: CC_B, c: E) extends T_B[E, CC_A[CC_C]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_C(_, _), CC_B(_, _, _), _) => 1 
  case CC_B(_, _, CC_A()) => 2 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A()) => 3 
  case CC_B(CC_C(_, _), CC_A(), _) => 4 
  case CC_B(_, _, _) => 5 
  case CC_B(CC_B(_, _, _), CC_A(), CC_A()) => 6 
  case CC_B(CC_B(_, _, _), CC_C(_, _), CC_B(_, _, _)) => 7 
  case CC_B(CC_A(), _, _) => 8 
  case CC_B(_, CC_C(_, _), _) => 9 
  case CC_B(CC_A(), CC_A(), CC_A()) => 10 
  case CC_B(CC_B(_, _, _), _, _) => 11 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 12 
  case CC_B(CC_A(), CC_B(_, _, _), _) => 13 
  case CC_B(CC_B(_, _, _), _, CC_A()) => 14 
  case CC_B(CC_B(_, _, _), CC_A(), CC_B(_, _, _)) => 15 
  case CC_B(_, CC_A(), CC_B(_, _, _)) => 16 
  case CC_B(CC_B(_, _, _), _, CC_C(_, _)) => 17 
  case CC_B(_, CC_C(_, _), CC_B(_, _, _)) => 18 
  case CC_B(CC_C(_, _), CC_C(_, _), CC_A()) => 19 
  case CC_B(_, _, CC_B(_, _, _)) => 20 
  case CC_B(CC_C(_, _), CC_C(_, _), _) => 21 
  case CC_B(CC_A(), CC_C(_, _), CC_B(_, _, _)) => 22 
  case CC_B(CC_A(), CC_C(_, _), _) => 23 
  case CC_B(CC_B(_, _, _), CC_A(), CC_C(_, _)) => 24 
  case CC_B(CC_B(_, _, _), CC_C(_, _), CC_A()) => 25 
  case CC_B(_, CC_C(_, _), CC_C(_, _)) => 26 
  case CC_B(CC_B(_, _, _), _, CC_B(_, _, _)) => 27 
  case CC_B(_, CC_C(_, _), CC_A()) => 28 
  case CC_B(CC_A(), CC_A(), _) => 29 
  case CC_B(CC_C(_, _), CC_C(_, _), CC_C(_, _)) => 30 
  case CC_B(CC_A(), CC_A(), CC_B(_, _, _)) => 31 
  case CC_B(CC_A(), CC_C(_, _), CC_A()) => 32 
  case CC_B(CC_C(_, _), _, _) => 33 
  case CC_B(CC_A(), _, CC_A()) => 34 
  case CC_B(CC_C(_, _), _, CC_B(_, _, _)) => 35 
  case CC_B(CC_A(), CC_B(_, _, _), CC_B(_, _, _)) => 36 
  case CC_B(CC_A(), CC_B(_, _, _), CC_A()) => 37 
  case CC_B(CC_C(_, _), CC_B(_, _, _), CC_B(_, _, _)) => 38 
  case CC_B(CC_A(), CC_A(), CC_C(_, _)) => 39 
  case CC_B(CC_C(_, _), _, CC_C(_, _)) => 40 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 41 
  case CC_B(CC_B(_, _, _), CC_C(_, _), _) => 42 
  case CC_B(_, CC_B(_, _, _), CC_C(_, _)) => 43 
  case CC_B(CC_C(_, _), CC_A(), CC_B(_, _, _)) => 44 
  case CC_C(CC_C(_, _), CC_B(_, _, _)) => 45 
  case CC_C(CC_A(), CC_B(_, _, _)) => 46 
  case CC_C(_, _) => 47 
  case CC_C(_, CC_B(_, _, _)) => 48 
}
}
// This is not matched: (CC_A Boolean (T_A Char))
// This is not matched: Pattern match is empty without constants