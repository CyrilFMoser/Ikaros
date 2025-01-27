package Program_2 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_A[D, D], b: T_B[D], c: T_B[D]) extends T_A[T_B[T_A[Boolean, Char]], D]
case class CC_B[E]() extends T_A[T_B[T_A[Boolean, Char]], E]
case class CC_C(a: Boolean, b: T_B[CC_A[Boolean]], c: CC_B[(Int,Boolean)]) extends T_A[T_B[T_A[Boolean, Char]], CC_A[T_A[(Byte,Byte), Boolean]]]
case class CC_D[F]() extends T_B[F]
case class CC_E[G]() extends T_B[G]
case class CC_F[H](a: T_A[H, H], b: CC_B[H], c: H) extends T_B[H]

val v_a: T_B[Char] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E() => 1 
  case CC_F(_, CC_B(), _) => 2 
}
}