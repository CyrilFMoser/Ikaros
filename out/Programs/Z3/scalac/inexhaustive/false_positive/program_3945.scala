package Program_15 

package Program_3 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E, F](a: T_A[F, E]) extends T_A[D, E]
case class CC_B[G](a: G, b: CC_A[G, G, G]) extends T_A[T_A[G, G], G]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_B(_, _)) => 0 
  case CC_A(CC_A(_)) => 1 
  case CC_B(_, CC_A(_)) => 2 
}
}
// This is not matched: (CC_A (T_A Byte Byte) Byte Boolean Wildcard (T_A (T_A Byte Byte) Byte))
// This is not matched: (CC_A (CC_A Char Boolean) (T_A (CC_A Char Boolean)))