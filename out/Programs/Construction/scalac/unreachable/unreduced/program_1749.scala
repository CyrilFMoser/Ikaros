package Program_22 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Boolean, b: T_B[D]) extends T_A[E, D]
case class CC_B[F](a: Char, b: T_A[F, F], c: CC_A[F, F]) extends T_A[Int, F]
case class CC_C[G]() extends T_A[Int, G]
case class CC_D(a: T_B[T_A[Int, Byte]], b: CC_B[Byte]) extends T_B[Char]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_, _, CC_A(_, _))