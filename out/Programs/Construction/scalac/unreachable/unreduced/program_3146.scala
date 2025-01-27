package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[E, F], b: T_A[F, E]) extends T_A[F, E]
case class CC_B[H, G](a: G, b: T_A[G, G]) extends T_A[H, G]
case class CC_C[I](a: Int) extends T_B[CC_A[T_A[Byte, Char], T_A[Int, Char]], I]
case class CC_D[J](a: CC_B[J, J]) extends T_B[T_A[CC_B[Int, Boolean], CC_A[Byte, Boolean]], J]

val v_a: T_B[T_A[CC_B[Int, Boolean], CC_A[Byte, Boolean]], Byte] = null
val v_b: Int = v_a match{
  case CC_D(CC_B(_, CC_A(_, _))) => 0 
  case CC_D(CC_B(_, CC_B(_, _))) => 1 
}
}