package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Byte, E], b: E) extends T_A[(T_B[Char, Char],Int), E]
case class CC_B[F](a: T_A[F, (Byte,Int)], b: T_A[F, F], c: T_B[F, F]) extends T_A[(T_B[Char, Char],Int), F]
case class CC_C() extends T_A[(T_B[Char, Char],Int), Byte]
case class CC_D[H, G](a: (Int,T_B[CC_C, Boolean]), b: T_B[G, G]) extends T_B[G, H]
case class CC_E[J, I](a: T_A[J, J], b: T_B[I, I], c: J) extends T_B[I, J]

val v_a: CC_D[Char, Int] = null
val v_b: Int = v_a match{
  case CC_D((12,CC_D(_, _)), _) => 0 
  case CC_D((12,CC_E(_, _, _)), _) => 1 
  case CC_D((_,CC_D(_, _)), _) => 2 
  case CC_D((_,CC_E(_, _, _)), _) => 3 
}
}