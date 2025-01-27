package Program_31 

package Program_4 

object Test {
sealed trait T_A
case class CC_A[A](a: (T_A,T_A), b: T_A) extends T_A
case class CC_B(a: T_A, b: Byte, c: Int) extends T_A
case class CC_C(a: CC_A[CC_B], b: T_A, c: Int) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), CC_B(_, _, _), 12) => 0 
  case CC_C(CC_A(_, _), _, _) => 1 
  case CC_C(CC_A(_, _), CC_C(_, _, _), _) => 2 
  case CC_C(_, CC_B(_, _, _), 12) => 3 
  case CC_C(CC_A(_, _), _, 12) => 4 
  case CC_C(_, _, 12) => 5 
  case CC_B(_, _, 12) => 6 
  case CC_B(_, _, _) => 7 
  case CC_B(CC_A(_, _), _, _) => 8 
  case CC_B(CC_B(_, _, _), _, 12) => 9 
  case CC_B(CC_C(_, _, _), 0, 12) => 10 
  case CC_B(CC_A(_, _), 0, _) => 11 
  case CC_A((CC_B(_, _, _),CC_B(_, _, _)), CC_B(_, _, _)) => 12 
  case CC_A((CC_A(_, _),CC_B(_, _, _)), CC_A(_, _)) => 13 
  case CC_A(_, CC_B(_, _, _)) => 14 
  case CC_A((CC_B(_, _, _),CC_B(_, _, _)), CC_C(_, _, _)) => 15 
  case CC_A(_, CC_C(_, _, _)) => 16 
  case CC_A(_, _) => 17 
  case CC_A(_, CC_A(_, _)) => 18 
  case CC_A((CC_B(_, _, _),CC_B(_, _, _)), CC_A(_, _)) => 19 
  case CC_A((CC_A(_, _),CC_C(_, _, _)), CC_A(_, _)) => 20 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), CC_B(_, _, _)) => 21 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), CC_A(_, _)) => 22 
  case CC_A((CC_B(_, _, _),CC_C(_, _, _)), CC_B(_, _, _)) => 23 
  case CC_A((CC_B(_, _, _),CC_C(_, _, _)), CC_A(_, _)) => 24 
  case CC_A((CC_B(_, _, _),CC_C(_, _, _)), _) => 25 
  case CC_A((CC_C(_, _, _),CC_A(_, _)), CC_C(_, _, _)) => 26 
  case CC_A((CC_B(_, _, _),CC_B(_, _, _)), _) => 27 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), _) => 28 
  case CC_A((CC_A(_, _),CC_C(_, _, _)), _) => 29 
  case CC_A((CC_C(_, _, _),CC_B(_, _, _)), CC_A(_, _)) => 30 
  case CC_A((CC_C(_, _, _),CC_B(_, _, _)), CC_C(_, _, _)) => 31 
  case CC_A((CC_B(_, _, _),CC_A(_, _)), CC_C(_, _, _)) => 32 
  case CC_A((CC_A(_, _),CC_B(_, _, _)), CC_C(_, _, _)) => 33 
  case CC_A((CC_C(_, _, _),CC_A(_, _)), _) => 34 
  case CC_A((CC_A(_, _),CC_A(_, _)), CC_B(_, _, _)) => 35 
  case CC_A((CC_C(_, _, _),CC_B(_, _, _)), _) => 36 
  case CC_A((CC_B(_, _, _),CC_A(_, _)), CC_B(_, _, _)) => 37 
  case CC_A((CC_B(_, _, _),CC_A(_, _)), _) => 38 
  case CC_A((CC_A(_, _),CC_A(_, _)), CC_C(_, _, _)) => 39 
  case CC_A((CC_C(_, _, _),CC_C(_, _, _)), CC_C(_, _, _)) => 40 
  case CC_A((CC_A(_, _),CC_B(_, _, _)), CC_B(_, _, _)) => 41 
  case CC_A((CC_B(_, _, _),CC_C(_, _, _)), CC_C(_, _, _)) => 42 
  case CC_A((CC_A(_, _),CC_A(_, _)), CC_A(_, _)) => 43 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_A Wildcard Wildcard Boolean T_A) Wildcard Wildcard T_A)