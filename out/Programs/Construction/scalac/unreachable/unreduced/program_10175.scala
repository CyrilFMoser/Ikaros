package Program_11 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E]() extends T_A[E, T_B[T_B[Boolean, Boolean], T_A[Boolean, Boolean]]]
case class CC_B[F](a: CC_A[F], b: Int, c: T_B[F, F]) extends T_A[F, Int]
case class CC_C(a: T_B[T_A[Char, Int], (Byte,Int)]) extends T_A[T_A[(Char,Char), T_B[Char, Char]], Int]
case class CC_D[G](a: G, b: CC_A[G], c: T_A[G, G]) extends T_B[(CC_B[CC_C],T_A[CC_C, Int]), G]
case class CC_E[H](a: CC_B[H], b: H, c: H) extends T_B[(CC_B[CC_C],T_A[CC_C, Int]), H]

val v_a: T_B[(CC_B[CC_C],T_A[CC_C, Int]), Boolean] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(), _) => 0 
  case CC_E(_, _, _) => 1 
}
}