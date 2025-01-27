package Program_31 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[C, Boolean]) extends T_A[D, C]

val v_a: CC_A[Boolean, Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      Int
//      (CC_A Boolean
//            Boolean
//            Boolean
//            (CC_A Boolean Boolean Boolean Wildcard (T_A Boolean Boolean))
//            (T_A Boolean Boolean))
//      (T_A Boolean Boolean))
// This is not matched: (CC_B Wildcard T_A)