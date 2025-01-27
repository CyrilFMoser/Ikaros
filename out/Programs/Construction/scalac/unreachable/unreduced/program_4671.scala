package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Int) extends T_A[E, T_B[E, E]]
case class CC_B[G](a: CC_A[CC_A[G, G], T_A[G, G]], b: T_A[G, G], c: G) extends T_A[G, T_A[G, G]]
case class CC_C[I, H](a: T_A[H, T_A[H, H]]) extends T_B[H, I]
case class CC_D[J](a: J) extends T_B[Int, J]
case class CC_E[K]() extends T_B[Int, K]

val v_a: T_B[Int, Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _, _)) => 0 
  case CC_D(_) => 1 
  case CC_E() => 2 
}
}