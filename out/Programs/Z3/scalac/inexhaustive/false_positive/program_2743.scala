package Program_29 

package Program_7 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: Boolean, b: T_A[B], c: T_A[Byte]) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_, _, CC_A(_, _, _)) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_C (T_B Byte Boolean)
//      Wildcard
//      Wildcard
//      (T_B (T_B Byte Boolean) (Tuple (Tuple Boolean Char) Byte)))