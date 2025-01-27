package Program_18 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: D, b: T_A[D, D]) extends T_A[Char, D]
case class CC_B[E](a: T_A[Char, E], b: Int, c: E) extends T_A[Char, E]
case class CC_C[F](a: (CC_B[(Boolean,Char)],T_A[(Int,Byte), Boolean]), b: T_A[Char, F], c: CC_B[F]) extends T_B[F]
case class CC_D[G](a: G, b: (CC_C[Boolean],T_B[Char])) extends T_B[G]
case class CC_E[H](a: T_A[Char, H]) extends T_B[H]

val v_a: T_A[Char, Int] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_, _), _, _) => 0 
  case CC_B(CC_B(_, _, _), _, _) => 1 
}
}
// This is not matched: CC_A(_, _)