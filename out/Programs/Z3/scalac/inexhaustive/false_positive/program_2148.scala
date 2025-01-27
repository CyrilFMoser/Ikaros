package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B]) extends T_A[B]
case class CC_B[C, D](a: T_A[C]) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_A(_) => 1 
}
}
// This is not matched: (CC_B Byte (T_A Boolean) Wildcard (T_A Byte))
// This is not matched: (CC_A Wildcard T_A)