package Program_31 

package Program_7 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: T_A[D, D], b: C, c: T_A[D, C]) extends T_A[C, T_A[C, (Byte,Boolean)]]

val v_a: T_A[Boolean, T_A[Boolean, (Byte,Boolean)]] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
}
}
// This is not matched: (CC_A Boolean
//      Boolean
//      Wildcard
//      Wildcard
//      Wildcard
//      (T_A Boolean (T_A Boolean (Tuple Byte Boolean))))
// This is not matched: (CC_A (CC_A Wildcard Wildcard T_A) Wildcard T_A)