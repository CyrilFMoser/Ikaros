package Program_6 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[T_A[E, E], E]) extends T_A[T_A[E, E], E]
case class CC_B[F, G](a: G) extends T_A[F, G]
case class CC_C[H, I](a: Byte, b: (Int,CC_A[Int]), c: I) extends T_B[CC_A[H], H]
case class CC_D[J](a: T_B[J, J], b: CC_C[J, J]) extends T_B[CC_A[J], J]
case class CC_E[K](a: T_A[K, K]) extends T_B[K, Boolean]

val v_a: T_B[CC_A[Int], Int] = null
val v_b: Int = v_a match{
  case CC_C(_, (_,CC_A(_)), _) => 0 
  case CC_D(_, CC_C(_, (_,_), _)) => 1 
}
}