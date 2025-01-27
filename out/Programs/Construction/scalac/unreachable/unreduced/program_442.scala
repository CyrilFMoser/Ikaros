package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A(a: T_A[T_B[Boolean, Char], T_B[Int, Byte]], b: T_A[Char, Char]) extends T_A[Char, Char]
case class CC_B[E, F](a: F) extends T_A[E, Int]
case class CC_C[G](a: Char, b: Char) extends T_A[G, Int]
case class CC_D[I, H](a: CC_C[I], b: T_A[I, I]) extends T_B[I, H]
case class CC_E[J, K]() extends T_B[K, J]
case class CC_F[L, M](a: T_B[L, M]) extends T_B[L, M]

val v_a: T_B[CC_A, CC_A] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(_, _), _) => 0 
  case CC_E() => 1 
  case CC_F(CC_D(_, _)) => 2 
  case CC_F(CC_E()) => 3 
  case CC_F(CC_F(_)) => 4 
}
}