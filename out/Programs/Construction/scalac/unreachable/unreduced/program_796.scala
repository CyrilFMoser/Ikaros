package Program_21 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_B[CC_A[T_B[Byte, Int]], E]
case class CC_C[F](a: F, b: T_B[F, F], c: Byte) extends T_B[CC_A[T_B[Byte, Int]], F]

val v_a: T_B[CC_A[T_B[Byte, Int]], Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_, _, _) => 1 
}
}