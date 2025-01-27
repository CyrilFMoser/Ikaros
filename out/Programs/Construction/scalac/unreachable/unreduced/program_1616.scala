package Program_30 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: F, b: F, c: T_A[F]) extends T_A[F]
case class CC_D[G](a: CC_C[G], b: T_A[G]) extends T_B[G, CC_B[G]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, CC_A()) => 2 
  case CC_C(_, _, CC_B(_)) => 3 
}
}
// This is not matched: CC_C(_, _, CC_C(_, _, _))