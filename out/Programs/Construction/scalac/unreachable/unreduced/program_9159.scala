package Program_23 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[E, E]) extends T_A[E, (T_A[Int, Char],Char)]
case class CC_B[F](a: CC_A[F], b: T_B[F, F]) extends T_A[F, (T_A[Int, Char],Char)]
case class CC_C[G, H](a: CC_B[CC_B[H]]) extends T_B[G, H]
case class CC_D[J, I](a: T_B[I, J]) extends T_B[I, J]
case class CC_E[K](a: K, b: Int) extends T_B[CC_B[CC_D[Byte, Boolean]], K]

val v_a: T_B[Boolean, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(CC_A(_, _), CC_C(_))) => 0 
  case CC_C(CC_B(CC_A(_, _), CC_D(_))) => 1 
  case CC_D(CC_C(CC_B(_, _))) => 2 
  case CC_D(CC_D(CC_C(_))) => 3 
  case CC_D(CC_D(CC_D(_))) => 4 
}
}