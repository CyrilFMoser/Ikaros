package Program_14 

package Program_9 

object Test {
sealed trait T_A
sealed trait T_B
case class CC_A[A](a: T_A, b: Int, c: T_B) extends T_A
case class CC_B(a: Char, b: (T_A,Int), c: T_A) extends T_A
case class CC_C(a: T_A, b: T_B) extends T_B

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), 12, _) => 0 
  case CC_A(_, 12, _) => 1 
  case CC_A(CC_A(_, _, _), _, CC_C(_, _)) => 2 
  case CC_A(_, _, _) => 3 
  case CC_A(CC_A(_, _, _), 12, _) => 4 
  case CC_A(CC_B(_, _, _), 12, CC_C(_, _)) => 5 
  case CC_A(_, _, CC_C(_, _)) => 6 
  case CC_A(CC_A(_, _, _), 12, CC_C(_, _)) => 7 
  case CC_A(CC_B(_, _, _), _, _) => 8 
  case CC_A(_, 12, CC_C(_, _)) => 9 
  case CC_B('x', (CC_A(_, _, _),_), CC_A(_, _, _)) => 10 
  case CC_B('x', (CC_A(_, _, _),_), _) => 11 
  case CC_B(_, (CC_B(_, _, _),_), _) => 12 
  case CC_B(_, (CC_B(_, _, _),12), CC_B(_, _, _)) => 13 
  case CC_B(_, (CC_B(_, _, _),12), _) => 14 
  case CC_B(_, (CC_A(_, _, _),_), CC_A(_, _, _)) => 15 
  case CC_B('x', (CC_A(_, _, _),_), CC_B(_, _, _)) => 16 
  case CC_B(_, _, CC_B(_, _, _)) => 17 
  case CC_B('x', (CC_B(_, _, _),_), _) => 18 
  case CC_B('x', (CC_A(_, _, _),12), CC_A(_, _, _)) => 19 
  case CC_B(_, _, CC_A(_, _, _)) => 20 
  case CC_B(_, (CC_B(_, _, _),12), CC_A(_, _, _)) => 21 
  case CC_B('x', (CC_B(_, _, _),12), _) => 22 
  case CC_B('x', (CC_B(_, _, _),_), CC_B(_, _, _)) => 23 
  case CC_B(_, (CC_A(_, _, _),12), CC_B(_, _, _)) => 24 
  case CC_B('x', (CC_B(_, _, _),12), CC_B(_, _, _)) => 25 
  case CC_B(_, (CC_A(_, _, _),12), _) => 26 
  case CC_B('x', (CC_A(_, _, _),12), _) => 27 
  case CC_B('x', (CC_A(_, _, _),12), CC_B(_, _, _)) => 28 
}
}
// This is not matched: (CC_B Wildcard
//      (Tuple (CC_A T_A
//                   (CC_A T_B Wildcard Int Wildcard T_A)
//                   Int
//                   (CC_C Wildcard
//                         (CC_C (CC_B Wildcard Wildcard Wildcard T_A)
//                               (CC_C (CC_B Wildcard
//                                           Wildcard
//                                           (CC_A T_A
//                                                 (CC_B Char
//                                                       Wildcard
//                                                       (CC_B Wildcard
//                                                             Wildcard
//                                                             (CC_B Wildcard
//                                                                   Wildcard
//                                                                   Wildcard
//                                                                   T_A)
//                                                             T_A)
//                                                       T_A)
//                                                 Int
//                                                 (CC_C (CC_B Wildcard
//                                                             Wildcard
//                                                             (CC_A T_A
//                                                                   Wildcard
//                                                                   Int
//                                                                   Wildcard
//                                                                   T_A)
//                                                             T_A)
//                                                       (CC_C (CC_A T_A
//                                                                   Wildcard
//                                                                   Wildcard
//                                                                   (CC_C (CC_B Wildcard
//                                                                               Wildcard
//                                                                               Wildcard
//                                                                               T_A)
//                                                                         Wildcard
//                                                                         T_B)
//                                                                   T_A)
//                                                             Wildcard
//                                                             T_B)
//                                                       T_B)
//                                                 T_A)
//                                           T_A)
//                                     Wildcard
//                                     T_B)
//                               T_B)
//                         T_B)
//                   T_A)
//             Int)
//      (CC_A T_A
//            (CC_B Wildcard Wildcard Wildcard T_A)
//            Wildcard
//            (CC_C Wildcard Wildcard T_B)
//            T_A)
//      T_A)
// This is not matched: (CC_D (Tuple Byte T_A)
//      (CC_C (CC_A T_A) Wildcard (T_B (CC_A Wildcard) (Tuple Byte T_A)))
//      (T_B (CC_A T_A) (Tuple Byte T_A)))