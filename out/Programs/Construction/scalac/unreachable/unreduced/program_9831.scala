package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: F) extends T_A[E, F]
case class CC_B[H, G](a: CC_A[H, G], b: Boolean) extends T_A[H, G]
case class CC_C[I, J, K](a: Int, b: T_B[J, T_A[I, K]]) extends T_A[J, I]
case class CC_D[L](a: CC_A[L, T_B[L, Char]], b: T_A[L, L]) extends T_B[T_B[T_A[Boolean, Char], T_A[Boolean, Byte]], L]

val v_a: CC_D[Int] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(12)) => 0 
  case CC_D(_, CC_A(_)) => 1 
  case CC_D(_, CC_B(_, _)) => 2 
  case CC_D(_, CC_C(_, _)) => 3 
}
}