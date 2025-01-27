package Program_40 

package Program_21 

object Test {
sealed trait T_A
sealed trait T_B[A]
case class CC_A[B](a: (Char,Int), b: T_B[T_A]) extends T_A
case class CC_B[C](a: T_B[C], b: C) extends T_B[C]
case class CC_C[D](a: T_B[D], b: T_A) extends T_B[D]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(('x',_), CC_B(_, _)) => 0 
  case CC_A(_, CC_B(_, _)) => 1 
  case CC_A((_,12), CC_B(_, _)) => 2 
  case CC_A(('x',12), CC_B(_, _)) => 3 
  case CC_A(('x',12), _) => 4 
  case CC_A(('x',_), CC_C(_, _)) => 5 
  case CC_A(('x',_), _) => 6 
  case CC_A((_,_), _) => 7 
  case CC_A((_,_), CC_B(_, _)) => 8 
  case CC_A(_, _) => 9 
  case CC_A(('x',12), CC_C(_, _)) => 10 
  case CC_A(_, CC_C(_, _)) => 11 
}
}
// This is not matched: (CC_A T_A
//      Wildcard
//      (CC_C T_A
//            (CC_C T_A
//                  Wildcard
//                  (CC_A T_A
//                        Wildcard
//                        (CC_C T_A
//                              (CC_B T_A Wildcard Wildcard (T_B T_A))
//                              Wildcard
//                              (T_B T_A))
//                        T_A)
//                  (T_B T_A))
//            Wildcard
//            (T_B T_A))
//      T_A)
// Mutation information: 
// Changing a Wildcard in 'x' at pattern position 10 to a constant expression:
// {
//  'x'
// }
//
// This is not matched: Pattern match is empty without constants
// Mutation information: 
// Changing a Wildcard in 12 at pattern position 0 to a constant expression:
// {
//  12
// }
//