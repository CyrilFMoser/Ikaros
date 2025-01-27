package Program_4 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: E, b: T_A[E]) extends T_A[E]
case class CC_C() extends T_A[CC_A[CC_A[Boolean]]]
case class CC_D[F]() extends T_B[(CC_A[CC_C],CC_B[CC_C]), F]
case class CC_E[G](a: Boolean, b: Byte, c: G) extends T_B[(CC_A[CC_C],CC_B[CC_C]), G]
case class CC_F[H](a: Byte) extends T_B[(CC_A[CC_C],CC_B[CC_C]), H]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, CC_A(_, _)) => 0 
  case CC_A(_, CC_B(_, CC_A(_, _))) => 1 
  case CC_A(_, CC_B(_, CC_B(_, _))) => 2 
  case CC_B(_, _) => 3 
}
}