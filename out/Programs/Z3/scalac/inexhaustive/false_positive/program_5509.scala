package Program_13 

package Program_10 

object Test {
sealed trait T_A[A]
case class CC_A[B, C](a: T_A[C], b: T_A[C]) extends T_A[B]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_, _), _) => 0 
}
}
// This is not matched: (CC_A Boolean Boolean Wildcard Wildcard (T_A Boolean))
// This is not matched: (CC_A (CC_D (T_A T_B T_B) T_B) Byte (T_A Byte (CC_D (T_A T_B T_B) T_B)))