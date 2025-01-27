package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, Char]
case class CC_B[F](a: T_A[F, Char], b: T_A[F, Char]) extends T_A[F, Char]
case class CC_C[H, G](a: T_A[H, Char]) extends T_B[G, H]

val v_a: T_A[Int, Char] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
}
}