package Program_30 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D], b: D) extends T_A[D, T_B[T_B[Char]]]
case class CC_B[E](a: T_B[E], b: T_A[E, E]) extends T_A[E, T_B[T_B[Char]]]
case class CC_C[F]() extends T_A[T_A[F, F], F]
case class CC_D[G](a: CC_B[G], b: CC_B[G]) extends T_B[G]
case class CC_E[H](a: (T_A[Byte, Byte],(Int,Char)), b: CC_B[H]) extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(CC_D(_, _), _), CC_B(CC_D(_, _), _)) => 0 
  case CC_D(CC_B(CC_E(_, _), _), CC_B(CC_D(_, _), _)) => 1 
  case CC_D(CC_B(CC_D(_, _), _), CC_B(CC_E(_, _), _)) => 2 
  case CC_D(CC_B(CC_E(_, _), _), CC_B(CC_E(_, _), _)) => 3 
  case CC_E(_, _) => 4 
}
}