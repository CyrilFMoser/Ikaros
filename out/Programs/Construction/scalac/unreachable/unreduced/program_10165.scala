package Program_27 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: Boolean, b: Byte) extends T_A[T_B[T_B[Boolean]], D]
case class CC_B[E](a: T_A[E, E]) extends T_A[T_B[T_B[Boolean]], E]
case class CC_C[F](a: F, b: (Char,T_A[Boolean, Char]), c: CC_B[CC_B[F]]) extends T_A[F, T_A[F, F]]
case class CC_D[G](a: G, b: G) extends T_B[G]
case class CC_E(a: Boolean) extends T_B[CC_A[Byte]]
case class CC_F(a: CC_A[T_B[(Char,Int)]]) extends T_B[CC_A[Byte]]

val v_a: T_A[T_B[T_B[Boolean]], CC_E] = null
val v_b: Int = v_a match{
  case CC_A(true, _) => 0 
  case CC_A(false, _) => 1 
  case CC_B(_) => 2 
}
}