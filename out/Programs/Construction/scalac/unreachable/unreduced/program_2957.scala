package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[D, (T_B[Char],T_A[Char, Byte])]
case class CC_B[E](a: E, b: T_B[(Boolean,Char)]) extends T_A[E, (T_B[Char],T_A[Char, Byte])]
case class CC_C[F](a: T_A[F, T_B[F]], b: T_B[F], c: T_B[F]) extends T_B[F]
case class CC_D[G](a: Byte, b: T_B[G], c: T_B[G]) extends T_B[G]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, _, CC_C(_, _, _)) => 0 
  case CC_D(_, _, CC_D(_, _, _)) => 1 
}
}
// This is not matched: CC_C(_, _, _)