package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E]) extends T_A[D, T_B[T_B[Int]]]
case class CC_B[F](a: T_B[F], b: T_B[T_A[F, F]]) extends T_A[F, T_B[T_B[Int]]]
case class CC_C[G, H]() extends T_A[G, T_B[T_B[Int]]]
case class CC_D[I](a: I, b: CC_B[I]) extends T_B[I]
case class CC_E(a: CC_A[CC_B[Byte], T_A[Char, Boolean]], b: Int, c: Int) extends T_B[Boolean]

val v_a: T_A[CC_E, T_B[T_B[Int]]] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(CC_D(_, _), CC_D(_, _)) => 1 
}
}
// This is not matched: CC_C()