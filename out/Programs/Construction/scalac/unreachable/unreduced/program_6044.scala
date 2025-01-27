package Program_31 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, T_A[D]], b: T_B[D, D]) extends T_A[((Byte,Char),Int)]
case class CC_B(a: Int, b: T_B[T_A[Int], T_A[Byte]], c: CC_A[Byte]) extends T_A[((Byte,Char),Int)]
case class CC_C[E](a: T_B[E, E], b: Boolean) extends T_B[T_A[E], E]
case class CC_D[F](a: T_B[T_A[F], F], b: T_B[T_A[F], F]) extends T_B[T_A[F], F]
case class CC_E[G](a: CC_B) extends T_B[T_A[G], G]

val v_a: T_B[T_A[Byte], Byte] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D(CC_C(_, _), CC_C(_, true)) => 1 
  case CC_D(CC_D(_, _), CC_C(_, true)) => 2 
  case CC_D(CC_E(CC_B(_, _, _)), CC_C(_, true)) => 3 
  case CC_D(CC_C(_, _), CC_C(_, false)) => 4 
  case CC_D(CC_D(_, _), CC_C(_, false)) => 5 
  case CC_D(CC_E(CC_B(_, _, _)), CC_C(_, false)) => 6 
  case CC_D(CC_D(_, _), CC_D(_, _)) => 7 
  case CC_D(CC_E(CC_B(_, _, _)), CC_D(_, _)) => 8 
  case CC_D(CC_C(_, _), CC_E(CC_B(_, _, _))) => 9 
  case CC_D(CC_D(_, _), CC_E(CC_B(_, _, _))) => 10 
  case CC_D(CC_E(CC_B(_, _, _)), CC_E(CC_B(_, _, _))) => 11 
  case CC_E(CC_B(_, _, CC_A(_, _))) => 12 
}
}
// This is not matched: CC_D(CC_C(_, _), CC_D(_, _))