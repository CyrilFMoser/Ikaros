package Program_15 

package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A[B](a: Char) extends T_A[B]
case class CC_B[C](a: ((Int,Boolean),T_B), b: T_A[C], c: T_A[C]) extends T_A[C]
case class CC_C[D](a: Byte, b: D) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
}
}
// This is not matched: (CC_C T_B Wildcard Wildcard T_B)
// This is not matched: (CC_D (CC_A Boolean) Byte Wildcard Wildcard (T_B (CC_A Boolean) Byte))