package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[Int, E]
case class CC_B[G, F](a: G) extends T_A[F, G]
case class CC_C[H](a: T_A[H, H], b: (CC_B[Byte, Int],T_B[Int, Boolean])) extends T_A[Int, H]
case class CC_D[I](a: T_A[Int, T_A[Int, I]], b: CC_A[I], c: CC_A[I]) extends T_B[(T_A[Int, Boolean],CC_A[Boolean]), I]

val v_a: T_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A() => 0 
  case CC_C(CC_B(_), (CC_B(_),_)) => 1 
}
}
// This is not matched: CC_B(_)