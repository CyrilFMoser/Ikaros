package Program_31 

package Program_2 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Char, c: T_A) extends T_A
case class CC_B[A](a: T_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, CC_B(_)) => 0 
  case CC_A(_, 'x', CC_A(_, _, _)) => 1 
  case CC_A(CC_A(_, _, _), _, _) => 2 
  case CC_A(CC_B(_), 'x', CC_A(_, _, _)) => 3 
  case CC_A(CC_B(_), 'x', _) => 4 
  case CC_A(_, 'x', CC_B(_)) => 5 
  case CC_A(CC_A(_, _, _), 'x', CC_B(_)) => 6 
  case CC_A(CC_B(_), _, _) => 7 
  case CC_A(CC_A(_, _, _), 'x', CC_A(_, _, _)) => 8 
  case CC_A(CC_B(_), 'x', CC_B(_)) => 9 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 10 
  case CC_A(CC_A(_, _, _), 'x', _) => 11 
}
}
// This is not matched: (CC_A (CC_B T_A Wildcard T_A) Wildcard Wildcard T_A)
// This is not matched: (CC_A (CC_A (CC_B (CC_B (CC_B Wildcard Wildcard T_A)
//                        (CC_B Wildcard Wildcard T_A)
//                        T_A)
//                  Wildcard
//                  T_A)
//            Wildcard
//            Wildcard
//            T_A)
//      Wildcard
//      Wildcard
//      T_A)