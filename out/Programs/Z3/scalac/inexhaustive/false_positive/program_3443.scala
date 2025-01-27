package Program_15 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: ((Boolean,Byte),Byte)) extends T_A[B]
case class CC_B[C]() extends T_A[T_A[Boolean]]
case class CC_C(a: T_A[Char]) extends T_A[CC_B[Char]]

val v_a: T_A[T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_A(((_,_),0)) => 1 
  case CC_A(((_,_),_)) => 2 
}
}
// This is not matched: (CC_B Boolean (T_A (T_A Boolean)))
// This is not matched: (CC_A (Tuple (CC_B Wildcard
//                   (CC_A Wildcard Wildcard T_A)
//                   (CC_A Wildcard
//                         (CC_C Wildcard
//                               (CC_A (Tuple Wildcard Wildcard) Wildcard T_A)
//                               T_A)
//                         T_A)
//                   T_A)
//             (CC_B Wildcard
//                   (CC_C (CC_A Wildcard (CC_C Wildcard Wildcard T_A) T_A)
//                         Wildcard
//                         T_A)
//                   Wildcard
//                   T_A))
//      Wildcard
//      T_A)