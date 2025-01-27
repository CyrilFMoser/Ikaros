package Program_6 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_A[D], b: T_A[D]) extends T_A[D]
case class CC_B[E](a: T_B[E, E], b: Char) extends T_A[E]
case class CC_C[F](a: T_A[F]) extends T_B[F, (Byte,T_A[Byte])]
case class CC_D[G](a: Int, b: G) extends T_B[G, (Byte,T_A[Byte])]

val v_a: T_B[Byte, (Byte,T_A[Byte])] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(CC_A(_, _), _)) => 0 
  case CC_C(CC_A(CC_B(_, _), _)) => 1 
  case CC_C(CC_B(_, _)) => 2 
  case CC_D(_, _) => 3 
}
}