package Program_29 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_A[E], b: Byte, c: E) extends T_B[Boolean, E]
case class CC_C[F](a: T_B[F, F], b: CC_A[Char], c: T_A[F]) extends T_B[Boolean, F]
case class CC_D(a: T_B[Boolean, CC_C[(Byte,Char)]]) extends T_B[Boolean, T_A[T_A[Byte]]]

val v_a: T_B[Boolean, T_A[T_A[Byte]]] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_), CC_A(_)) => 0 
  case CC_D(_) => 1 
}
}
// This is not matched: CC_B(_, _, _)