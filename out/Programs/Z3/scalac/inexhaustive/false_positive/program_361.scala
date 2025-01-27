package Program_31 

package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E, F](a: T_A[E]) extends T_A[E]
case class CC_C[G](a: T_A[G], b: T_A[G], c: Byte) extends T_B[G, T_A[(Char,Boolean)]]
case class CC_D[H](a: T_A[H], b: CC_A[H], c: CC_A[H]) extends T_B[H, T_A[(Char,Boolean)]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_B(CC_B(_)) => 2 
  case CC_B(_) => 3 
}
}
// This is not matched: (CC_B Byte Boolean Wildcard (T_A Byte))
// This is not matched: (CC_C Wildcard T_A)