package Program_29 

package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: D, b: T_A[Byte]) extends T_A[C]
case class CC_B[E](a: T_A[E], b: Boolean) extends T_B[E]
case class CC_C() extends T_B[T_A[Byte]]

val v_a: T_A[CC_C] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
}
}
// This is not matched: (CC_A (CC_C Boolean) Boolean Wildcard Wildcard (T_A (CC_C Boolean)))
// This is not matched: (CC_B T_A)