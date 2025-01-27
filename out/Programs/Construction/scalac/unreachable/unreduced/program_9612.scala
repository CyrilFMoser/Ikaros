package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[T_B[T_B[Byte, Boolean], T_B[Char, Boolean]], E]
case class CC_B[F](a: F, b: F) extends T_A[T_B[T_B[Byte, Boolean], T_B[Char, Boolean]], F]
case class CC_C[H, G](a: H, b: G, c: T_A[Byte, H]) extends T_B[H, G]

val v_a: T_A[T_B[T_B[Byte, Boolean], T_B[Char, Boolean]], Int] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, _)) => 0 
  case CC_B(12, _) => 1 
  case CC_B(_, _) => 2 
}
}