package Program_9 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[Byte], b: T_A[Boolean]) extends T_A[Byte]
case class CC_B[D](a: D, b: T_A[Byte]) extends T_A[Byte]
case class CC_C[F, E]() extends T_B[E, F]
case class CC_D[G](a: G) extends T_B[G, T_B[T_A[Byte], G]]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(CC_A(_, _), _), _) => 0 
  case CC_A(CC_A(CC_B(_, _), _), _) => 1 
  case CC_A(CC_B(_, _), _) => 2 
  case CC_B(_, _) => 3 
}
}