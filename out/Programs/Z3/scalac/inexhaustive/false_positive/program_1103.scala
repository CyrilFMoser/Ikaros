package Program_31 

package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D], c: D) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: (Int,Byte), b: (Byte,Char)) extends T_A[F]
case class CC_D[G, H](a: CC_A[H], b: Byte) extends T_B[Byte, G]
case class CC_E(a: T_A[Byte], b: CC_C[Int]) extends T_B[Byte, T_A[Byte]]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_D(_, 0) => 0 
  case CC_D(_, _) => 1 
}
}
// This is not matched: (CC_D Byte Boolean Wildcard Wildcard (T_B Byte Byte))
// This is not matched: (CC_A Boolean Wildcard (T_A (T_A (Tuple Char Boolean) Boolean) (T_A Int Byte)))