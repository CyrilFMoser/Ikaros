package Program_13 

package Program_1 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: T_A[B]) extends T_A[T_A[Boolean]]
case class CC_B(a: Char, b: T_A[Char], c: ((Char,Char),Byte)) extends T_A[T_A[Boolean]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_A(CC_B(_, _, _), CC_B(_, _, _)) => 1 
}
}
// This is not matched: (CC_A (T_A Boolean)
//      (CC_A (T_A Boolean)
//            Wildcard
//            (CC_A (T_A Boolean)
//                  (CC_A Boolean Wildcard Wildcard (T_A (T_A Boolean)))
//                  (CC_A (T_A Boolean)
//                        Wildcard
//                        (CC_B Wildcard
//                              Wildcard
//                              (Tuple (Tuple Char Char) Wildcard)
//                              (T_A (T_A Boolean)))
//                        (T_A (T_A Boolean)))
//                  (T_A (T_A Boolean)))
//            (T_A (T_A Boolean)))
//      Wildcard
//      (T_A (T_A Boolean)))
// This is not matched: (CC_A (CC_B Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)