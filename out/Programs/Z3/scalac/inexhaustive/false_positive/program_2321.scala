package Program_31 

package Program_9 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: (Boolean,Char)) extends T_A[B]
case class CC_B[C, D](a: CC_A[C]) extends T_A[C]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
}
}
// This is not matched: (CC_B Byte Boolean (CC_A Byte Wildcard (T_A Byte)) (T_A Byte))
// This is not matched: (CC_C (T_B (T_A Boolean Boolean) (CC_B Byte Byte Boolean Boolean)))