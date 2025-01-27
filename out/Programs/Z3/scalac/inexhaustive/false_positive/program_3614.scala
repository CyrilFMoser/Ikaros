package Program_15 

package Program_0 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: Int) extends T_A[D]
case class CC_B[F](a: T_A[F]) extends T_A[F]
case class CC_C[G, H, I]() extends T_B[G, H]
case class CC_D[J](a: T_A[J], b: T_A[J], c: J) extends T_B[J, T_A[J]]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_C() => 0 
}
}
// This is not matched: (CC_C Byte Byte Boolean (T_B Byte Byte))
// This is not matched: (CC_C Wildcard (CC_A Wildcard T_A) T_A)