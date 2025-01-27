package Program_30 

package Program_7 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: Byte) extends T_A
case class CC_B(a: T_A, b: T_A, c: Int) extends T_A
case class CC_C(a: T_A, b: CC_B) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_A(CC_B(_, _, _), 0) => 1 
  case CC_A(_, 0) => 2 
  case CC_A(CC_B(_, _, _), _) => 3 
  case CC_C(CC_A(_, _), CC_B(_, _, _)) => 4 
  case CC_C(_, CC_B(_, _, _)) => 5 
  case CC_C(CC_A(_, _), _) => 6 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), 12) => 7 
  case CC_B(_, CC_C(_, _), _) => 8 
  case CC_B(CC_C(_, _), _, _) => 9 
  case CC_B(CC_A(_, _), CC_A(_, _), _) => 10 
  case CC_B(CC_C(_, _), CC_C(_, _), _) => 11 
  case CC_B(_, CC_A(_, _), _) => 12 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 13 
  case CC_B(CC_B(_, _, _), CC_C(_, _), 12) => 14 
  case CC_B(CC_C(_, _), CC_B(_, _, _), 12) => 15 
  case CC_B(_, CC_C(_, _), 12) => 16 
  case CC_B(CC_A(_, _), CC_B(_, _, _), _) => 17 
  case CC_B(CC_B(_, _, _), CC_A(_, _), 12) => 18 
  case CC_B(CC_A(_, _), CC_A(_, _), 12) => 19 
  case CC_B(_, CC_A(_, _), 12) => 20 
}
}
// This is not matched: (CC_B (CC_A T_A
//            (CC_C Wildcard (CC_B Wildcard Wildcard Int T_A) T_A)
//            Wildcard
//            T_A)
//      (CC_A T_A (CC_A T_A (CC_A T_A Wildcard Wildcard T_A) Byte T_A) Byte T_A)
//      Wildcard
//      T_A)
// This is not matched: (CC_A T_A Wildcard T_A)