package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Int) extends T_A[D, T_B[D]]
case class CC_B[E](a: T_A[E, T_B[E]], b: T_A[E, T_B[E]], c: T_A[E, E]) extends T_A[E, T_B[E]]
case class CC_C[F](a: F, b: T_A[F, T_B[F]]) extends T_A[T_B[Char], F]
case class CC_D(a: T_A[CC_B[Char], T_B[CC_B[Char]]], b: T_A[T_B[Boolean], T_B[T_B[Boolean]]], c: (T_A[Boolean, Char],T_B[Byte])) extends T_B[Byte]

val v_a: T_A[T_B[Char], Boolean] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_A(_)) => 0 
  case CC_C(_, CC_B(_, _, _)) => 1 
}
}