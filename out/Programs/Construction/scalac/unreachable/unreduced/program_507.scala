package Program_14 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Char, Char], b: (T_B[Char, Boolean],T_A[Char])) extends T_A[T_B[Int, Boolean]]
case class CC_B[D](a: T_B[D, D]) extends T_A[D]
case class CC_C[E](a: CC_A, b: Char) extends T_B[E, T_A[E]]
case class CC_D[F](a: CC_B[CC_B[F]]) extends T_B[F, T_A[F]]

val v_a: T_B[Boolean, T_A[Boolean]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_, _), _) => 0 
  case CC_D(_) => 1 
}
}