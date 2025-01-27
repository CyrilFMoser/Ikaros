package Program_12 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: Int, b: T_B[C]) extends T_A[C]
case class CC_B[D](a: Int) extends T_A[D]
case class CC_C[E](a: T_A[E], b: Int) extends T_A[E]
case class CC_D[F](a: T_B[F]) extends T_B[F]
case class CC_E[G](a: G, b: CC_D[G], c: G) extends T_B[G]
case class CC_F[H, I](a: CC_D[I], b: T_A[I]) extends T_B[H]

val v_a: CC_F[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_F(CC_D(_), CC_A(_, _)) => 0 
  case CC_F(CC_D(_), CC_B(_)) => 1 
}
}
// This is not matched: (CC_F Byte
//      Byte
//      Wildcard
//      (CC_C Byte (CC_A Byte Wildcard Wildcard (T_A Byte)) Wildcard (T_A Byte))
//      (T_B Byte))
// This is not matched: (CC_A T_A Wildcard T_A)