package Program_15 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A(a: T_A, b: T_A, c: Char) extends T_A
case class CC_B[A](a: CC_A, b: CC_A, c: (T_A,T_B)) extends T_A
case class CC_C(a: CC_A, b: T_B, c: Char) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), _, _) => 0 
  case CC_A(CC_C(_, _, _), CC_C(_, _, _), _) => 1 
  case CC_A(CC_C(_, _, _), CC_A(_, _, _), 'x') => 2 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), 'x') => 3 
  case CC_A(CC_A(_, _, _), CC_A(_, _, _), _) => 4 
  case CC_A(CC_A(_, _, _), CC_B(_, _, _), 'x') => 5 
  case CC_A(CC_C(_, _, _), CC_B(_, _, _), _) => 6 
  case CC_A(CC_B(_, _, _), _, 'x') => 7 
  case CC_A(CC_C(_, _, _), _, 'x') => 8 
  case CC_A(_, CC_A(_, _, _), _) => 9 
  case CC_A(CC_B(_, _, _), CC_C(_, _, _), _) => 10 
  case CC_A(_, CC_B(_, _, _), 'x') => 11 
  case CC_A(_, CC_B(_, _, _), _) => 12 
  case CC_A(CC_A(_, _, _), _, _) => 13 
  case CC_A(CC_A(_, _, _), CC_C(_, _, _), _) => 14 
  case CC_A(CC_B(_, _, _), CC_C(_, _, _), 'x') => 15 
  case CC_A(CC_B(_, _, _), CC_A(_, _, _), _) => 16 
}
}
// This is not matched: (CC_A (CC_B T_A
//            (CC_A Wildcard (CC_A Wildcard Wildcard Char T_A) Char T_A)
//            (CC_A Wildcard Wildcard Wildcard T_A)
//            Wildcard
//            T_A)
//      (CC_B T_A Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      T_A)
// This is not matched: (CC_A (CC_B T_A
//            (CC_A Wildcard (CC_A Wildcard Wildcard Char T_A) Char T_A)
//            (CC_A Wildcard Wildcard Wildcard T_A)
//            Wildcard
//            T_A)
//      (CC_B T_A Wildcard Wildcard Wildcard T_A)
//      Wildcard
//      T_A)