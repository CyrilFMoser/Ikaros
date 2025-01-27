package Program_15 

package Program_8 

object Test {
sealed trait T_A[A]
case class CC_A[B](a: T_A[B], b: B) extends T_A[B]
case class CC_B[C, D](a: T_A[C]) extends T_A[C]
case class CC_C[E](a: T_A[E], b: T_A[E]) extends T_A[E]

val v_a: CC_C[Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_C(_, _)) => 0 
  case CC_C(_, CC_B(_)) => 1 
}
}
// This is not matched: (CC_C Byte
//      Wildcard
//      (CC_A Byte (CC_B Byte Boolean Wildcard (T_A Byte)) Wildcard (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_A Byte T_B Byte Wildcard (T_A Byte (T_A Byte Byte)))