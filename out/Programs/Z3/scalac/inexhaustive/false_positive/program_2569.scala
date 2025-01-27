package Program_29 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_B() extends T_A[T_B[Byte, Byte], Boolean]
case class CC_D[F](a: F) extends T_B[T_A[CC_B, CC_B], F]

val v_a: CC_D[Char] = null
val v_b: Int = v_a match{
  case CC_D('x') => 0 
}
}
// This is not matched: (CC_B T_A T_A)