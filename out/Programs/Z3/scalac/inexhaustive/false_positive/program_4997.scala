package Program_15 

package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B
case class CC_A[C, D](a: D) extends T_A[C, Byte]
case class CC_B(a: T_A[T_B, T_B]) extends T_B

val v_a: T_A[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
}
}
// This is not matched: (CC_A Byte T_B Wildcard (T_A Byte Byte))
// This is not matched: (CC_A Byte T_B Wildcard (T_A Byte Byte))