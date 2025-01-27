package Program_7 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: Int) extends T_A[Int, D]
case class CC_B[F](a: F, b: Char) extends T_A[Int, F]
case class CC_C[G](a: T_A[G, G], b: T_A[Int, T_A[Int, Int]]) extends T_A[Int, G]

val v_a: T_A[Int, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _) => 2 
}
}