package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E](a: T_B[T_A[E, E], F]) extends T_A[F, E]
case class CC_B[G, H, I]() extends T_A[H, G]
case class CC_C[J](a: Int, b: Boolean) extends T_B[CC_B[J, J, Boolean], J]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(_) => 0 
  case CC_B() => 1 
}
}