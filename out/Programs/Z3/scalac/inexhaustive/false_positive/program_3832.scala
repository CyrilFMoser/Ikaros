package Program_14 

package Program_11 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A() extends T_A
case class CC_B(a: (CC_A,Boolean), b: T_A, c: T_A) extends T_A
case class CC_C[A](a: Char) extends T_A
case class CC_D() extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(_) => 1 
  case CC_C('x') => 2 
  case CC_B((CC_A(),_), _, CC_B(_, _, _)) => 3 
  case CC_B(_, CC_A(), _) => 4 
  case CC_B(_, CC_C(_), _) => 5 
  case CC_B(_, _, CC_C(_)) => 6 
  case CC_B((CC_A(),_), CC_B(_, _, _), CC_C(_)) => 7 
  case CC_B((CC_A(),_), _, CC_C(_)) => 8 
  case CC_B((CC_A(),_), CC_B(_, _, _), CC_B(_, _, _)) => 9 
  case CC_B(_, CC_C(_), CC_C(_)) => 10 
  case CC_B((CC_A(),_), CC_B(_, _, _), _) => 11 
  case CC_B(_, CC_C(_), CC_B(_, _, _)) => 12 
  case CC_B(_, _, CC_B(_, _, _)) => 13 
  case CC_B(_, CC_B(_, _, _), CC_B(_, _, _)) => 14 
  case CC_B(_, CC_C(_), CC_A()) => 15 
  case CC_B((CC_A(),_), CC_A(), _) => 16 
  case CC_B(_, CC_A(), CC_C(_)) => 17 
  case CC_B((CC_A(),_), CC_C(_), CC_C(_)) => 18 
  case CC_B(_, CC_B(_, _, _), CC_C(_)) => 19 
  case CC_B(_, CC_B(_, _, _), CC_A()) => 20 
  case CC_B(_, _, CC_A()) => 21 
  case CC_B((CC_A(),_), CC_C(_), CC_B(_, _, _)) => 22 
  case CC_B((CC_A(),_), CC_C(_), _) => 23 
  case CC_B((CC_A(),_), CC_C(_), CC_A()) => 24 
  case CC_B((CC_A(),_), CC_A(), CC_B(_, _, _)) => 25 
  case CC_B((CC_A(),_), CC_A(), CC_A()) => 26 
  case CC_B(_, CC_A(), CC_A()) => 27 
  case CC_B((CC_A(),_), _, CC_A()) => 28 
}
}
// This is not matched: (CC_C T_A Wildcard T_A)
// This is not matched: (CC_A T_A)