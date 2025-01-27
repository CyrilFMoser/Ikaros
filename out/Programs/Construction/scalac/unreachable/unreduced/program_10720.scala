package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Int) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Int) extends T_A[E]
case class CC_C[F](a: F, b: Byte, c: F) extends T_A[F]
case class CC_D[G](a: T_A[G], b: T_B[G, G]) extends T_B[G, T_A[G]]

val v_a: T_A[Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _) => 1 
  case CC_C(_, _, _) => 2 
}
}