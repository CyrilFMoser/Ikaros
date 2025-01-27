package Program_2 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D) extends T_A[D]
case class CC_B[E](a: T_A[E], b: T_B[E, E], c: T_B[E, E]) extends T_A[E]
case class CC_C(a: Char) extends T_A[CC_B[T_A[Int]]]
case class CC_D[F](a: T_A[F]) extends T_B[F, T_A[T_A[F]]]

val v_a: T_A[T_A[CC_B[T_A[Int]]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_B(_, _, _))) => 0 
  case CC_A(CC_B(CC_A(_), _, _)) => 1 
  case CC_A(CC_B(CC_B(_, _, _), _, _)) => 2 
  case CC_A(CC_B(CC_C(_), _, _)) => 3 
  case CC_A(CC_C(_)) => 4 
  case CC_B(_, _, _) => 5 
}
}