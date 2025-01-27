package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_A[D, E]) extends T_A[D, E]
case class CC_B[F, G](a: T_B[F]) extends T_A[F, G]
case class CC_C[H](a: T_A[H, H], b: T_B[H]) extends T_A[H, CC_B[T_A[Byte, Boolean], T_A[Int, Byte]]]
case class CC_D(a: CC_C[Boolean]) extends T_B[T_B[(Byte,Byte)]]

val v_a: CC_A[Int, Byte] = null
val v_b: Int = v_a match{
  case CC_A(CC_A(_)) => 0 
  case CC_A(CC_B(_)) => 1 
}
}