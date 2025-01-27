package Program_1 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: T_B[T_B[F, F], F], b: T_A[F, F]) extends T_A[F, E]
case class CC_B[G](a: G, b: (T_A[Byte, Boolean],(Char,Char))) extends T_A[G, T_B[G, G]]
case class CC_C[H](a: Byte, b: CC_B[H]) extends T_B[Byte, H]
case class CC_D[I]() extends T_B[Byte, I]
case class CC_E[J](a: Boolean, b: J, c: Boolean) extends T_B[Byte, J]

val v_a: T_A[Char, T_B[Char, Char]] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_B(_, (_,_)) => 1 
}
}