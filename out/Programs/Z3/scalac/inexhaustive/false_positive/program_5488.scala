package Program_14 

package Program_6 

object Test {
sealed trait T_A
case class CC_A(a: (T_A,Char), b: T_A, c: T_A) extends T_A
case class CC_B[A](a: Boolean, b: T_A, c: T_A) extends T_A

val v_a: CC_A = null
val v_b: Int = v_a match{
  case CC_A((CC_B(_, _, _),_), CC_A(_, _, _), CC_B(_, _, _)) => 0 
  case CC_A((CC_A(_, _, _),_), CC_B(_, _, _), _) => 1 
  case CC_A((CC_A(_, _, _),'x'), _, CC_B(_, _, _)) => 2 
  case CC_A((CC_A(_, _, _),_), CC_B(_, _, _), CC_B(_, _, _)) => 3 
  case CC_A((CC_A(_, _, _),'x'), CC_A(_, _, _), CC_B(_, _, _)) => 4 
  case CC_A((CC_B(_, _, _),'x'), CC_B(_, _, _), CC_A(_, _, _)) => 5 
  case CC_A((CC_A(_, _, _),'x'), CC_B(_, _, _), _) => 6 
  case CC_A((CC_A(_, _, _),_), _, _) => 7 
  case CC_A((CC_B(_, _, _),'x'), CC_B(_, _, _), _) => 8 
  case CC_A(_, CC_B(_, _, _), CC_B(_, _, _)) => 9 
  case CC_A((CC_A(_, _, _),'x'), CC_B(_, _, _), CC_A(_, _, _)) => 10 
  case CC_A((CC_B(_, _, _),_), CC_B(_, _, _), CC_A(_, _, _)) => 11 
  case CC_A((CC_B(_, _, _),_), _, CC_B(_, _, _)) => 12 
  case CC_A((CC_B(_, _, _),'x'), CC_A(_, _, _), CC_A(_, _, _)) => 13 
  case CC_A((CC_A(_, _, _),'x'), _, _) => 14 
}
}
// This is not matched: (CC_A (Tuple (CC_B T_A
//                   Wildcard
//                   Wildcard
//                   (CC_B T_A Boolean Wildcard Wildcard T_A)
//                   T_A)
//             Wildcard)
//      (CC_A Wildcard
//            Wildcard
//            (CC_B T_A
//                  Boolean
//                  (CC_A Wildcard Wildcard Wildcard T_A)
//                  Wildcard
//                  T_A)
//            T_A)
//      Wildcard
//      T_A)
// This is not matched: (CC_B Int Wildcard (T_A Int))