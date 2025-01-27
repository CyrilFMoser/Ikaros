package Program_31 

package Program_4 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_B, b: T_A, c: (T_B,Boolean)) extends T_A
case class CC_B[A](a: T_A, b: Char, c: ((Byte,Int),T_B)) extends T_A
case class CC_C() extends T_A
case class CC_D(a: T_B, b: T_A, c: CC_B[Char]) extends T_B
case class CC_E(a: CC_B[CC_C]) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_E(CC_B(_, _, _)) => 0 
  case CC_D(_, CC_B(_, _, _), _) => 1 
  case CC_D(CC_E(_), CC_C(), _) => 2 
  case CC_D(CC_D(_, _, _), CC_B(_, _, _), CC_B(_, _, _)) => 3 
  case CC_D(CC_E(_), _, CC_B(_, _, _)) => 4 
  case CC_D(CC_E(_), CC_B(_, _, _), _) => 5 
  case CC_D(CC_E(_), CC_C(), CC_B(_, _, _)) => 6 
  case CC_D(_, CC_A(_, _, _), _) => 7 
  case CC_D(CC_E(_), CC_A(_, _, _), CC_B(_, _, _)) => 8 
  case CC_D(_, CC_A(_, _, _), CC_B(_, _, _)) => 9 
  case CC_D(CC_D(_, _, _), CC_B(_, _, _), _) => 10 
  case CC_D(_, CC_C(), _) => 11 
  case CC_D(CC_E(_), CC_A(_, _, _), _) => 12 
  case CC_D(_, CC_C(), CC_B(_, _, _)) => 13 
}
}
// This is not matched: (CC_D (CC_D (CC_E Wildcard T_B)
//            (CC_C T_A)
//            (CC_B Char (CC_C T_A) Char Wildcard T_A)
//            T_B)
//      (CC_B T_A Wildcard Char Wildcard T_A)
//      (CC_B Char Wildcard Char Wildcard T_A)
//      T_B)
// This is not matched: Pattern match is empty without constants