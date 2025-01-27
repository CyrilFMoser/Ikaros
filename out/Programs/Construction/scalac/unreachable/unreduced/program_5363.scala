package Program_18 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: Boolean, b: T_B[T_B[Byte, Char], T_A[Byte]]) extends T_A[T_A[T_B[Int, Byte]]]
case class CC_B[D, E]() extends T_B[D, E]
case class CC_C[F, G](a: F) extends T_B[G, F]
case class CC_D[H](a: CC_C[CC_A, H], b: H) extends T_B[T_B[Int, T_A[Char]], H]

val v_a: T_B[Byte, T_A[T_A[T_B[Int, Byte]]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(CC_A(_, CC_B())) => 1 
  case CC_C(CC_A(_, CC_C(_))) => 2 
}
}