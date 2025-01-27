package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, T_B[E, E]], b: (T_B[Boolean, Char],Boolean)) extends T_A[E, T_A[E, E]]
case class CC_B[F](a: T_A[F, F]) extends T_A[F, T_A[F, F]]
case class CC_C[H, G](a: T_B[G, H]) extends T_B[G, H]

val v_a: T_A[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_A(_, (CC_C(_),_)) => 0 
  case CC_B(_) => 1 
}
}