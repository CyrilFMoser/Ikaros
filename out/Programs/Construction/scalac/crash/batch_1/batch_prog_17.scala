package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: T_A[C], c: (T_A[Char],T_A[Int])) extends T_A[C]
case class CC_B[D](a: T_A[D], b: Byte) extends T_A[D]
case class CC_C[E](a: CC_B[T_A[E]], b: CC_B[E]) extends T_A[E]
case class CC_D[F](a: T_B[F]) extends T_B[F]
case class CC_E[G](a: CC_D[G]) extends T_B[G]
case class CC_F(a: CC_C[T_A[Char]], b: T_A[CC_B[Byte]]) extends T_B[CC_D[T_A[Int]]]

val v_a: T_B[CC_D[T_A[Int]]] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
  case CC_E(CC_D(CC_D(_))) => 1 
  case CC_E(CC_D(CC_E(_))) => 2 
  case CC_E(CC_D(CC_F(_, _))) => 3 
  case CC_F(CC_C(CC_B(_, _), CC_B(_, _)), CC_A(_, _, _)) => 4 
  case CC_F(CC_C(CC_B(_, _), CC_B(_, _)), CC_B(_, _)) => 5 
}
}
// This is not matched: CC_F(CC_C(CC_B(_, _), CC_B(_, _)), CC_C(_, _))