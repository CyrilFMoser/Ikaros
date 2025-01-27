package Program_31 

package Program_3 

object Test {
sealed trait T_A
case class CC_A(a: T_A, b: Byte, c: (T_A,(Char,Char))) extends T_A
case class CC_B(a: T_A, b: T_A, c: CC_A) extends T_A
case class CC_C[A](a: CC_A, b: CC_A) extends T_A

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _, _), 0, (CC_C(_, _),(_,_))) => 0 
  case CC_A(CC_B(_, _, _), _, _) => 1 
  case CC_A(CC_C(_, _), _, (CC_B(_, _, _),(_,_))) => 2 
  case CC_A(_, _, _) => 3 
  case CC_A(_, _, (CC_B(_, _, _),(_,_))) => 4 
  case CC_A(CC_B(_, _, _), _, (CC_B(_, _, _),(_,_))) => 5 
  case CC_B(CC_C(_, _), CC_A(_, _, _), _) => 6 
  case CC_B(_, CC_B(_, _, _), _) => 7 
  case CC_B(_, CC_B(_, _, _), CC_A(_, _, _)) => 8 
  case CC_B(_, CC_C(_, _), _) => 9 
  case CC_B(CC_A(_, _, _), CC_B(_, _, _), CC_A(_, _, _)) => 10 
  case CC_B(CC_B(_, _, _), _, CC_A(_, _, _)) => 11 
  case CC_B(CC_A(_, _, _), _, CC_A(_, _, _)) => 12 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), CC_A(_, _, _)) => 13 
  case CC_B(_, _, CC_A(_, _, _)) => 14 
  case CC_B(CC_B(_, _, _), CC_C(_, _), _) => 15 
  case CC_B(CC_B(_, _, _), _, _) => 16 
  case CC_B(CC_C(_, _), CC_C(_, _), CC_A(_, _, _)) => 17 
  case CC_B(_, CC_C(_, _), CC_A(_, _, _)) => 18 
  case CC_B(_, CC_A(_, _, _), CC_A(_, _, _)) => 19 
  case CC_B(CC_C(_, _), CC_B(_, _, _), _) => 20 
  case CC_B(CC_A(_, _, _), CC_C(_, _), CC_A(_, _, _)) => 21 
  case CC_B(CC_A(_, _, _), _, _) => 22 
  case CC_B(CC_C(_, _), _, _) => 23 
  case CC_B(CC_C(_, _), CC_C(_, _), _) => 24 
  case CC_B(CC_B(_, _, _), CC_A(_, _, _), _) => 25 
  case CC_B(CC_B(_, _, _), CC_B(_, _, _), _) => 26 
  case CC_B(CC_C(_, _), CC_A(_, _, _), CC_A(_, _, _)) => 27 
  case CC_B(CC_B(_, _, _), CC_C(_, _), CC_A(_, _, _)) => 28 
  case CC_B(CC_C(_, _), _, CC_A(_, _, _)) => 29 
  case CC_C(CC_A(_, _, _), _) => 30 
  case CC_C(_, _) => 31 
}
}
// This is not matched: (CC_C T_A Wildcard Wildcard T_A)
// This is not matched: (CC_B Wildcard
//      Wildcard
//      (CC_B (CC_A (CC_A (CC_A Wildcard T_A) T_A) T_A)
//            (CC_A Wildcard T_A)
//            (CC_B (CC_A Wildcard T_A)
//                  (CC_A (CC_A Wildcard T_A) T_A)
//                  Wildcard
//                  T_A)
//            T_A)
//      T_A)