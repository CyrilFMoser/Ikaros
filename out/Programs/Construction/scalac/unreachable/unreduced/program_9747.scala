package Program_25 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: T_B[D, Byte], c: Byte) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_A[E]) extends T_A[E]
case class CC_C[F](a: CC_B[F], b: ((Boolean,Boolean),T_B[Boolean, Int]), c: CC_A[F]) extends T_B[T_B[F, F], F]
case class CC_D[G](a: T_B[T_B[G, G], G]) extends T_B[T_B[G, G], G]

val v_a: T_B[T_B[Int, Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _, _), CC_A(_, _, _)), _, _) => 0 
  case CC_C(CC_B(CC_A(_, _, _), CC_B(_, _)), _, _) => 1 
  case CC_C(CC_B(CC_B(_, _), CC_A(_, _, _)), _, _) => 2 
  case CC_C(CC_B(CC_B(_, _), CC_B(_, _)), _, _) => 3 
  case CC_D(CC_C(CC_B(_, _), (_,_), _)) => 4 
  case CC_D(CC_D(CC_C(_, _, _))) => 5 
}
}
// This is not matched: CC_D(CC_D(CC_D(_)))