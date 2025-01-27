package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G](a: T_A[G, G], b: T_B[G, G], c: G) extends T_B[T_B[T_A[Char, Boolean], T_A[Boolean, Byte]], G]
case class CC_C[H](a: Byte) extends T_B[H, T_A[H, H]]
case class CC_D[I](a: T_B[I, CC_A[I, I]]) extends T_B[I, T_A[I, I]]

val v_a: T_B[Int, T_A[Int, Int]] = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
  case CC_D(_) => 1 
}
}