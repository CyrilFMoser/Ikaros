package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[D, T_B[Byte]]
case class CC_B[E](a: T_B[E], b: T_B[T_B[E]], c: T_A[E, E]) extends T_A[E, T_B[Byte]]
case class CC_C[F](a: Byte, b: T_B[F], c: T_A[F, F]) extends T_B[F]

val v_a: T_A[Int, T_B[Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}