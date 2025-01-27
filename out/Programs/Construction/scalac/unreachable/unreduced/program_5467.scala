package Program_9 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[Int, T_A[Boolean, Char]]]
case class CC_B[F]() extends T_A[F, T_B[Int, T_A[Boolean, Char]]]
case class CC_C[H, G]() extends T_B[G, H]
case class CC_D[I](a: T_A[I, I], b: T_B[Boolean, I], c: Boolean) extends T_B[I, T_B[(Int,Boolean), CC_A[Char]]]
case class CC_E[J]() extends T_B[J, T_B[(Int,Boolean), CC_A[Char]]]

val v_a: T_B[Char, T_B[(Int,Boolean), CC_A[Char]]] = null
val v_b: Int = v_a match{
  case CC_D(_, _, _) => 0 
  case CC_E() => 1 
}
}
// This is not matched: CC_C()