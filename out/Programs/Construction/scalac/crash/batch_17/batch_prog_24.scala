package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: D, b: D) extends T_A[D]
case class CC_B[F, E]() extends T_B[E, F]
case class CC_C[G, H](a: CC_A[H]) extends T_B[G, H]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}
// This is not matched: CC_C(_)