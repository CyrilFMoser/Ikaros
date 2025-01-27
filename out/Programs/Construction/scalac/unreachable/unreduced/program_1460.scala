package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: T_A[E, E], c: Char) extends T_A[(T_A[Char, Byte],Char), E]
case class CC_B[F, G](a: Int, b: T_A[F, F]) extends T_A[F, G]
case class CC_C(a: T_B[Byte, T_A[Char, Char]]) extends T_A[(T_A[Char, Byte],Char), Byte]
case class CC_D[H]() extends T_B[H, T_B[T_A[CC_C, CC_C], CC_B[CC_C, CC_C]]]
case class CC_E[I](a: T_A[I, I], b: CC_B[I, I]) extends T_B[I, T_B[T_A[CC_C, CC_C], CC_B[CC_C, CC_C]]]

val v_a: T_A[(T_A[Char, Byte],Char), Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_B(_, _), _) => 0 
  case CC_B(_, CC_A(_, _, _)) => 1 
  case CC_B(_, CC_B(_, _)) => 2 
  case CC_C(_) => 3 
}
}