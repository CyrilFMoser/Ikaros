package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[F, E]
case class CC_B[H, G](a: Boolean, b: T_B[G, H], c: G) extends T_A[H, G]
case class CC_C[I](a: I, b: CC_A[I, I]) extends T_B[(Int,Int), I]

val v_a: T_A[Int, Int] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_B(_, _, _) => 1 
}
}