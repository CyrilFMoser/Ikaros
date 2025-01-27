package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D]) extends T_A[T_B[D], D]
case class CC_B[E](a: Boolean, b: T_A[T_A[E, E], E], c: E) extends T_A[T_B[E], E]
case class CC_C[F](a: T_B[T_A[T_B[Int], T_B[Int]]], b: T_A[T_B[F], F]) extends T_B[F]
case class CC_D[H](a: H, b: T_B[H]) extends T_B[H]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_C(_, _), CC_A(_)) => 0 
  case CC_C(CC_C(_, _), CC_B(_, _, _)) => 1 
  case CC_C(CC_D(_, _), CC_A(_)) => 2 
  case CC_C(CC_D(_, _), CC_B(_, _, _)) => 3 
  case CC_D(_, _) => 4 
}
}