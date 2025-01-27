package Program_31 

package Program_8 

object Test {
sealed trait T_A[A, B]
case class CC_A[D, C, E](a: T_A[C, D]) extends T_A[C, D]

val v_a: CC_A[Boolean, Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Int
//      Byte
//      (CC_A Boolean
//            Int
//            Boolean
//            (CC_A Boolean Int Boolean Wildcard (T_A Int Boolean))
//            (T_A Int Boolean))
//      (T_A Int Boolean))
// This is not matched: (CC_A Wildcard (T_A Byte (Tuple Char Boolean)))