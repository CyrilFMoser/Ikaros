package Program_30 

package Program_5 

object Test {
sealed trait T_A
case class CC_A[A](a: T_A, b: A, c: (T_A,T_A)) extends T_A

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, (CC_A(_, _, _),CC_A(_, _, _))) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Wildcard
//      Wildcard
//      (Tuple (CC_A T_A
//                   (CC_A Wildcard
//                         (CC_A Boolean Wildcard Boolean Wildcard T_A)
//                         Boolean
//                         Wildcard
//                         T_A)
//                   Wildcard
//                   Wildcard
//                   T_A)
//             Wildcard)
//      T_A)
// This is not matched: (CC_F Wildcard T_B)