package Program_31 

package Program_15 

object Test {
sealed trait T_A[A, B]
case class CC_A[C, D](a: C) extends T_A[T_A[C, C], C]
case class CC_B[E](a: CC_A[E, E], b: CC_A[Boolean, E]) extends T_A[T_A[E, E], E]
case class CC_C[F](a: CC_A[F, F], b: CC_A[F, F]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[Byte, Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_C(CC_A(_), CC_A(_)) => 1 
  case CC_B(CC_A(_), CC_A(_)) => 2 
  case CC_B(_, _) => 3 
  case CC_B(_, CC_A(_)) => 4 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard (T_A (T_A Byte Byte) Byte))
// This is not matched: (CC_A Byte Boolean Wildcard (T_A (T_A Byte Byte) Byte))