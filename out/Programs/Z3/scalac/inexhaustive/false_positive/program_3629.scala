package Program_14 

package Program_5 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_A, b: T_B[C, C], c: T_B[C, C]) extends T_A

val v_a: CC_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _, _), _, _) => 0 
}
}
// This is not matched: (CC_A Boolean (CC_A T_A Wildcard Wildcard Wildcard T_A) Wildcard Wildcard T_A)
// This is not matched: (CC_B (CC_E Boolean
//            Boolean
//            Wildcard
//            (CC_A Boolean Wildcard (T_A Boolean Boolean))
//            T_B)
//      Wildcard
//      (T_A Byte Boolean))