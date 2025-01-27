package Program_16 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Int, Boolean]]) extends T_A[T_A[T_A[Int]]]
case class CC_B[D](a: Byte, b: T_A[D], c: T_A[D]) extends T_A[T_A[T_A[Int]]]
case class CC_C[F, E](a: F, b: CC_A, c: E) extends T_B[F, E]
case class CC_D[G](a: Byte, b: T_B[G, T_A[G]]) extends T_B[G, T_A[G]]
case class CC_E[H](a: T_B[H, H], b: T_B[H, H]) extends T_B[H, T_A[H]]

val v_a: T_B[Byte, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(0, CC_A(_), _) => 0 
  case CC_C(_, CC_A(_), _) => 1 
  case CC_D(_, CC_C(_, _, _)) => 2 
  case CC_D(_, CC_D(_, CC_C(_, _, _))) => 3 
  case CC_D(_, CC_D(_, CC_D(_, _))) => 4 
  case CC_D(_, CC_D(_, CC_E(_, _))) => 5 
  case CC_D(_, CC_E(CC_C(_, _, _), _)) => 6 
  case CC_E(_, _) => 7 
}
}