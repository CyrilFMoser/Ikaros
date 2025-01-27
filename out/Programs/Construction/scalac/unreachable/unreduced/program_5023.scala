package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_A[D, D], D]
case class CC_B(a: T_A[Int, T_A[Byte, Boolean]], b: T_B[CC_A[Int]], c: T_B[Byte]) extends T_A[T_A[T_A[T_A[Byte, Byte], Byte], T_A[T_A[Byte, Byte], Byte]], T_A[T_A[Byte, Byte], Byte]]
case class CC_C[E](a: CC_B, b: T_B[E], c: T_A[E, E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: T_A[T_A[T_A[T_A[Byte, Byte], Byte], T_A[T_A[Byte, Byte], Byte]], T_A[T_A[Byte, Byte], Byte]] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}