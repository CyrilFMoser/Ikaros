package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D) extends T_A[D, (T_B[Char],Boolean)]
case class CC_B[E](a: T_A[E, E], b: T_B[E], c: CC_A[E]) extends T_A[E, (T_B[Char],Boolean)]
case class CC_C[F](a: Int, b: CC_A[F]) extends T_A[F, (T_B[Char],Boolean)]

val v_a: T_A[Int, (T_B[Char],Boolean)] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _, CC_A(_)) => 1 
  case CC_C(_, _) => 2 
}
}