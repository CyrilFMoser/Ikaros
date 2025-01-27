package Program_5 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E](a: T_A[E], b: CC_A[E], c: T_B[E, E]) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_B[F, T_B[F, F]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(CC_A(), CC_A(), _) => 1 
  case CC_B(CC_B(CC_B(_, _, _), CC_A(), _), CC_A(), _) => 2 
}
}
// This is not matched: CC_B(CC_B(CC_A(), CC_A(), _), CC_A(), _)