package Program_15 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B
case class CC_A(a: T_B) extends T_A[T_B]
case class CC_B[B](a: CC_A) extends T_B

val v_a: T_B = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
}
}
// This is not matched: (CC_B T_B Wildcard T_B)
// This is not matched: (CC_D (T_B (Tuple (CC_A Boolean Boolean) Byte) Int))