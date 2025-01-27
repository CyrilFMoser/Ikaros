package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: Boolean) extends T_A[Byte, E]
case class CC_B(a: T_B[T_A[Char, Char], CC_A[Byte]], b: T_A[T_A[Byte, Boolean], T_A[Byte, Int]]) extends T_A[Byte, T_B[T_A[Byte, Char], CC_A[Int]]]
case class CC_C[F, G](a: CC_B, b: G, c: T_A[Byte, G]) extends T_B[T_A[CC_A[CC_B], CC_B], F]
case class CC_D[H](a: T_A[Byte, H]) extends T_B[T_A[CC_A[CC_B], CC_B], H]

val v_a: T_B[T_A[CC_A[CC_B], CC_B], Char] = null
val v_b: Int = v_a match{
  case CC_C(CC_B(_, _), _, _) => 0 
  case CC_D(_) => 1 
}
}