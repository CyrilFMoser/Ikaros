package Program_7 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Int, Int], T_B[(Char,Char), Char]]) extends T_A[T_B[T_A[Byte], Boolean]]
case class CC_B() extends T_A[T_B[T_A[Byte], Boolean]]
case class CC_C() extends T_A[Boolean]
case class CC_D[D, E]() extends T_B[E, D]
case class CC_E[F, G]() extends T_B[F, G]
case class CC_F[H, I](a: T_A[H], b: T_B[I, I], c: CC_A) extends T_B[I, H]

val v_a: T_A[T_B[T_A[Byte], Boolean]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D()) => 0 
  case CC_A(CC_E()) => 1 
  case CC_A(CC_F(_, _, CC_A(_))) => 2 
  case CC_B() => 3 
}
}