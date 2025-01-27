package Program_17 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[Char, E], b: T_B[E, E], c: T_A[E, E]) extends T_A[Char, E]
case class CC_B(a: Int) extends T_A[((Byte,Boolean),T_A[Char, Int]), (Int,T_A[Byte, Int])]
case class CC_C(a: CC_A[T_A[Char, CC_B]], b: T_A[Int, T_A[Char, CC_B]], c: Char) extends T_A[((Byte,Boolean),T_A[Char, Int]), (Int,T_A[Byte, Int])]
case class CC_D[G, F](a: CC_A[F]) extends T_B[F, G]
case class CC_E[H](a: (CC_C,T_B[CC_B, CC_B])) extends T_B[Byte, H]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_A(_, _, _)) => 0 
  case CC_E(_) => 1 
}
}