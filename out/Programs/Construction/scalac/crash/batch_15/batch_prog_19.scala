package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D]() extends T_A[T_B[D], D]
case class CC_B(a: (T_A[Int, Char],T_A[Byte, Char])) extends T_A[T_B[CC_A[Byte]], T_B[T_B[Boolean]]]
case class CC_C[E](a: CC_A[E]) extends T_B[E]
case class CC_D[F]() extends T_B[F]

val v_a: T_B[Boolean] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
}
}
// This is not matched: CC_C(_)