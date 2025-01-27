package Program_3 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D, E](a: T_A[E]) extends T_A[D]
case class CC_B[F](a: T_B[F, F]) extends T_A[F]
case class CC_C[G]() extends T_A[G]
case class CC_D[H](a: T_A[H], b: CC_C[H], c: T_B[H, H]) extends T_B[T_A[H], H]

val v_a: T_A[Int] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_) => 1 
  case CC_C() => 2 
}
}