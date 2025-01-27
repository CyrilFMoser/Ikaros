package Program_31 

package Program_12 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: (T_B,T_B), b: T_B) extends T_A
case class CC_B(a: Int, b: T_B) extends T_A
case class CC_C(a: T_B, b: T_A, c: CC_B) extends T_A
case class CC_D(a: T_A, b: CC_C, c: T_B) extends T_B
case class CC_E(a: CC_D) extends T_B
case class CC_F[A](a: A, b: T_B) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_D(_, _, _)) => 0 
  case CC_F(_, _) => 1 
  case CC_D(CC_A(_, _), CC_C(_, _, _), CC_E(_)) => 2 
  case CC_D(CC_A(_, _), _, CC_F(_, _)) => 3 
  case CC_D(CC_C(_, _, _), _, CC_D(_, _, _)) => 4 
  case CC_D(CC_C(_, _, _), _, _) => 5 
  case CC_D(CC_C(_, _, _), CC_C(_, _, _), CC_E(_)) => 6 
  case CC_D(CC_C(_, _, _), CC_C(_, _, _), CC_D(_, _, _)) => 7 
  case CC_D(CC_B(_, _), CC_C(_, _, _), CC_D(_, _, _)) => 8 
  case CC_D(_, _, CC_F(_, _)) => 9 
  case CC_D(_, CC_C(_, _, _), CC_D(_, _, _)) => 10 
  case CC_D(CC_B(_, _), _, CC_D(_, _, _)) => 11 
  case CC_D(CC_B(_, _), CC_C(_, _, _), CC_E(_)) => 12 
  case CC_D(CC_A(_, _), CC_C(_, _, _), CC_F(_, _)) => 13 
  case CC_D(_, CC_C(_, _, _), _) => 14 
  case CC_D(CC_C(_, _, _), _, CC_E(_)) => 15 
  case CC_D(CC_B(_, _), _, CC_F(_, _)) => 16 
  case CC_D(CC_B(_, _), CC_C(_, _, _), _) => 17 
  case CC_D(CC_A(_, _), _, CC_E(_)) => 18 
  case CC_D(CC_A(_, _), CC_C(_, _, _), _) => 19 
  case CC_D(_, _, CC_D(_, _, _)) => 20 
  case CC_D(CC_B(_, _), _, CC_E(_)) => 21 
  case CC_D(_, CC_C(_, _, _), CC_E(_)) => 22 
  case CC_D(CC_B(_, _), CC_C(_, _, _), CC_F(_, _)) => 23 
  case CC_D(CC_C(_, _, _), _, CC_F(_, _)) => 24 
  case CC_D(CC_C(_, _, _), CC_C(_, _, _), CC_F(_, _)) => 25 
  case CC_D(CC_A(_, _), _, _) => 26 
  case CC_D(CC_B(_, _), _, _) => 27 
  case CC_D(_, CC_C(_, _, _), CC_F(_, _)) => 28 
  case CC_D(CC_A(_, _), _, CC_D(_, _, _)) => 29 
  case CC_D(CC_A(_, _), CC_C(_, _, _), CC_D(_, _, _)) => 30 
  case CC_D(_, _, _) => 31 
}
}
// This is not matched: (CC_F T_A Wildcard Wildcard T_B)
// This is not matched: (CC_A (CC_A Wildcard T_A) T_A)