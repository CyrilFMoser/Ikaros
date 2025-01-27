package Program_21 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E], b: T_B[E, E], c: (T_B[Byte, (Int,Boolean)],T_A[Boolean, Byte])) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, T_A[F, F]], b: Boolean, c: T_A[F, T_A[F, F]]) extends T_A[F, T_A[F, F]]
case class CC_C(a: Byte, b: T_A[T_A[Int, Boolean], CC_A[Int]]) extends T_B[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], Boolean]
case class CC_D() extends T_B[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], Boolean]

val v_a: T_B[T_A[CC_A[Char], T_A[CC_A[Char], CC_A[Char]]], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, _) => 0 
  case CC_D() => 1 
}
}