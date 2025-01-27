package Program_24 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_A[T_B[Byte, Boolean]]) extends T_A[(Int,T_A[Boolean])]
case class CC_B[D](a: CC_A) extends T_B[D, Byte]
case class CC_C[E]() extends T_B[CC_A, E]
case class CC_D[F](a: T_B[F, Byte], b: CC_C[F], c: Int) extends T_B[F, Byte]

val v_a: T_B[Byte, Byte] = null
val v_b: Int = v_a match{
  case CC_B(CC_A(_)) => 0 
  case CC_D(CC_B(CC_A(_)), CC_C(), _) => 1 
  case CC_D(CC_D(_, _, _), CC_C(), _) => 2 
}
}