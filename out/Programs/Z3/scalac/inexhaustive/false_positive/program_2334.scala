package Program_31 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[B], c: T_A[C]) extends T_A[B]
case class CC_B[D]() extends T_A[D]
case class CC_C(a: CC_A[Int, Boolean], b: T_A[Int]) extends T_A[(Int,Char)]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(CC_A(_, _, _), CC_B(), CC_B()) => 1 
  case CC_A(CC_B(), CC_B(), CC_A(_, _, _)) => 2 
  case CC_A(CC_C(_, _), CC_A(_, _, _), _) => 3 
  case CC_A(CC_C(_, _), _, CC_C(_, _)) => 4 
  case CC_A(CC_B(), CC_A(_, _, _), CC_C(_, _)) => 5 
  case CC_A(CC_B(), _, CC_C(_, _)) => 6 
  case CC_A(CC_A(_, _, _), _, _) => 7 
  case CC_A(_, CC_B(), _) => 8 
  case CC_A(CC_B(), CC_A(_, _, _), CC_A(_, _, _)) => 9 
  case CC_A(CC_A(_, _, _), _, CC_A(_, _, _)) => 10 
  case CC_A(_, CC_B(), CC_B()) => 11 
  case CC_A(CC_A(_, _, _), _, CC_B()) => 12 
  case CC_A(CC_B(), _, CC_A(_, _, _)) => 13 
  case CC_A(CC_C(_, _), CC_B(), CC_B()) => 14 
  case CC_A(_, CC_B(), CC_C(_, _)) => 15 
  case CC_A(_, CC_A(_, _, _), CC_B()) => 16 
  case CC_A(_, CC_A(_, _, _), _) => 17 
  case CC_A(_, _, CC_C(_, _)) => 18 
  case CC_A(CC_A(_, _, _), CC_B(), CC_C(_, _)) => 19 
  case CC_A(_, _, CC_B()) => 20 
  case CC_A(CC_A(_, _, _), _, CC_C(_, _)) => 21 
  case CC_A(CC_C(_, _), CC_A(_, _, _), CC_A(_, _, _)) => 22 
  case CC_A(CC_B(), CC_B(), _) => 23 
}
}
// This is not matched: (CC_A Byte
//      (T_A (CC_C Boolean Boolean (T_A Boolean)))
//      (CC_A (T_A (CC_C Boolean Boolean Boolean))
//            (CC_B (CC_C Boolean Boolean Boolean) Boolean)
//            (CC_B (CC_B (CC_C Boolean Boolean Boolean) Boolean)
//                  (T_A (CC_B (CC_C Boolean Boolean Boolean) Boolean)))
//            Wildcard
//            (CC_B (CC_B (CC_C Boolean (T_A Boolean) Boolean) Boolean)
//                  (T_A (CC_B (CC_C Boolean (T_A Boolean) Boolean) Boolean)))
//            (T_A (T_A (CC_C Boolean Boolean Boolean))))
//      Wildcard
//      (CC_B (T_A (CC_C (T_A Boolean) Boolean Boolean))
//            (T_A (T_A (CC_C (T_A Boolean) Boolean Boolean))))
//      (T_A Byte))
// This is not matched: (CC_A Char Wildcard Wildcard Wildcard (T_A (T_A Char Char) Char))