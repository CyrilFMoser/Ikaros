package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E]() extends T_A[E, F]
case class CC_B[G, H](a: T_B[G, H]) extends T_A[G, H]
case class CC_C[J, I, K](a: Char) extends T_A[I, J]
case class CC_D[L](a: T_A[L, L], b: CC_B[L, L]) extends T_B[T_A[CC_B[Char, Boolean], (Boolean,Boolean)], L]
case class CC_E[M](a: Char) extends T_B[T_A[CC_B[Char, Boolean], (Boolean,Boolean)], M]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_B(_) => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A()