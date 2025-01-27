package Program_19 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_A[F, T_B[F, T_A[F, F]]], b: Boolean) extends T_A[F, E]
case class CC_B[H, I](a: T_A[H, H], b: T_A[T_B[I, H], H]) extends T_A[I, H]
case class CC_C[J](a: T_B[J, J], b: J, c: T_B[CC_B[J, (Boolean,Boolean)], J]) extends T_B[CC_A[CC_B[Char, Int], CC_B[Int, Byte]], J]
case class CC_D[L, K](a: T_B[T_B[Boolean, Boolean], T_B[Boolean, Boolean]]) extends T_B[L, K]

val v_a: CC_A[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_B(CC_A(_, _), CC_A(_, _)), _) => 2 
  case CC_A(CC_B(CC_A(_, _), CC_B(_, _)), _) => 3 
  case CC_A(CC_B(CC_B(_, _), CC_A(_, _)), _) => 4 
  case CC_A(CC_B(CC_B(_, _), CC_B(_, _)), _) => 5 
}
}