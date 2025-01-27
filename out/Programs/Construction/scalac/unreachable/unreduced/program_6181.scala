package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_B[D, T_B[Int, D]]) extends T_A[D]
case class CC_B[E](a: E, b: T_B[E, E], c: T_A[E]) extends T_B[E, Int]
case class CC_C[F, G](a: CC_A[F], b: T_A[F], c: Char) extends T_B[F, Int]
case class CC_D[H](a: Boolean, b: H) extends T_B[H, Int]

val v_a: T_B[Boolean, Int] = null
val v_b: Int = v_a match{
  case CC_B(_, _, _) => 0 
  case CC_C(_, _, 'x') => 1 
  case CC_C(_, _, _) => 2 
  case CC_D(_, _) => 3 
}
}