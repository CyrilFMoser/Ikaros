package Program_12 

package Program_4 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D, E](a: T_A[D, E]) extends T_A[C, D]

val v_a: CC_A[Char, Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Char
//      Int
//      Boolean
//      (CC_A Int
//            Boolean
//            Boolean
//            (CC_A Boolean Boolean Boolean Wildcard (T_A Boolean Boolean))
//            (T_A Int Boolean))
//      (T_A Char Int))
// This is not matched: (CC_A Wildcard T_A)