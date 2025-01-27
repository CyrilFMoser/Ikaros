package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: T_A[E]) extends T_A[E]
case class CC_C[F](a: T_A[F], b: T_A[F]) extends T_A[F]
case class CC_D[G](a: T_A[G]) extends T_B[T_A[Boolean], G]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_A()) => 0 
  case CC_D(CC_B(_, _)) => 1 
  case CC_D(CC_C(CC_A(), _)) => 2 
  case CC_D(CC_C(CC_B(_, _), _)) => 3 
}
}
// This is not matched: CC_D(CC_C(CC_C(_, _), _))