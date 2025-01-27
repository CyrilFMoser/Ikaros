package Program_30 

package Program_15 

object Test {
sealed trait T_A
sealed trait T_B[A, B]
case class CC_A[C](a: T_B[C, C], b: T_B[C, C]) extends T_A
case class CC_B(a: T_B[Byte, Boolean], b: CC_A[Byte], c: (T_A,T_A)) extends T_A
case class CC_C[D](a: Boolean, b: (Boolean,Char)) extends T_B[D, T_B[T_A, CC_B]]
case class CC_D[E](a: T_B[T_A, E], b: T_B[E, E], c: T_A) extends T_B[T_A, E]

val v_a: T_A = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, CC_A(_, _), _) => 1 
}
}
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)
// This is not matched: (CC_A T_A Wildcard Wildcard T_A)