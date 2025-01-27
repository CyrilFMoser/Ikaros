package Program_31 

package Program_11 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E]() extends T_A[D]
case class CC_B[F](a: T_A[F], b: T_A[F]) extends T_A[F]
case class CC_C[G, H](a: H, b: Int) extends T_B[H, G]
case class CC_D[J, I](a: I, b: CC_B[I]) extends T_B[J, I]
case class CC_E[L, K](a: L, b: CC_B[L]) extends T_B[K, L]

val v_a: CC_B[Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(), _) => 0 
  case CC_B(_, CC_A()) => 1 
  case CC_B(CC_B(_, _), CC_B(_, _)) => 2 
  case CC_B(CC_B(_, _), _) => 3 
  case CC_B(CC_B(_, _), CC_A()) => 4 
}
}
// This is not matched: (CC_B Byte
//      (CC_A Byte Boolean (T_A Byte))
//      (CC_A Byte (T_A Boolean) (T_A Byte))
//      (T_A Byte))
// This is not matched: (CC_C T_A)