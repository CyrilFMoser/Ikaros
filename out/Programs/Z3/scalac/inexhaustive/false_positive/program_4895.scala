package Program_15 

package Program_0 

object Test {
sealed trait T_A
case class CC_A[A](a: A, b: T_A, c: T_A) extends T_A
case class CC_B(a: CC_A[Char], b: (T_A,T_A)) extends T_A
case class CC_C(a: CC_B, b: CC_B, c: T_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
  case CC_A(_, CC_A(_, _, _), CC_B(_, _)) => 1 
  case CC_A(_, CC_A(_, _, _), CC_A(_, _, _)) => 2 
  case CC_A(_, CC_A(_, _, _), CC_C(_, _, _)) => 3 
  case CC_A(_, CC_B(_, _), CC_B(_, _)) => 4 
  case CC_A(_, CC_B(_, _), _) => 5 
  case CC_A(_, CC_C(_, _, _), CC_C(_, _, _)) => 6 
  case CC_A(_, CC_A(_, _, _), _) => 7 
  case CC_A(_, CC_C(_, _, _), CC_B(_, _)) => 8 
  case CC_A(_, CC_B(_, _), CC_C(_, _, _)) => 9 
  case CC_B(CC_A(_, _, _), (CC_C(_, _, _),CC_B(_, _))) => 10 
  case CC_B(CC_A(_, _, _), (CC_B(_, _),CC_A(_, _, _))) => 11 
  case CC_B(_, (CC_B(_, _),CC_A(_, _, _))) => 12 
  case CC_B(CC_A(_, _, _), (CC_A(_, _, _),CC_C(_, _, _))) => 13 
  case CC_B(_, _) => 14 
  case CC_B(CC_A(_, _, _), (CC_A(_, _, _),CC_B(_, _))) => 15 
  case CC_B(_, (CC_C(_, _, _),CC_A(_, _, _))) => 16 
  case CC_C(_, CC_B(_, _), CC_B(_, _)) => 17 
  case CC_C(CC_B(_, _), _, _) => 18 
}
}
// This is not matched: (CC_A T_A
//      Wildcard
//      (CC_A Wildcard Boolean Wildcard Wildcard T_A)
//      (CC_A T_A Wildcard (CC_A T_A Wildcard Wildcard Wildcard T_A) Wildcard T_A)
//      T_A)
// This is not matched: (CC_E Char
//      (Tuple Wildcard Int)
//      Wildcard
//      Wildcard
//      (T_B Char (CC_C Boolean Boolean Boolean)))