package Program_30 

package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D]) extends T_A[D]
case class CC_B[E](a: T_A[E]) extends T_A[E]
case class CC_C(a: Boolean) extends T_B[T_A[Char], Byte]
case class CC_D(a: T_A[CC_C], b: (CC_C,Byte)) extends T_B[T_A[Char], Byte]
case class CC_E[F](a: CC_C, b: F) extends T_B[Byte, T_A[CC_D]]

val v_a: T_B[Byte, T_A[CC_D]] = null
val v_b: Int = v_a match{
  case CC_E(CC_C(_), _) => 0 
}
}
// This is not matched: (CC_E Byte Wildcard Byte (T_B Byte (T_A (CC_D Boolean Boolean Boolean))))
// This is not matched: (CC_E Byte Wildcard Byte (T_B Byte (T_A (CC_D Boolean Boolean Boolean))))