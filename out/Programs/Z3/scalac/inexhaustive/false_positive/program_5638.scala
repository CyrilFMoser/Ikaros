package Program_13 

package Program_1 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C, D](a: T_A[C], b: T_A[D], c: T_A[D]) extends T_A[C]
case class CC_B[E]() extends T_B[E]
case class CC_C[F](a: CC_A[F, F], b: F) extends T_B[F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _, _), _) => 0 
  case CC_A(_, _, _) => 1 
}
}
// This is not matched: (CC_A Byte Boolean Wildcard Wildcard Wildcard (T_A Byte))
// This is not matched: (CC_B T_A)