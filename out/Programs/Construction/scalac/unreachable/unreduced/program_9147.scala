package Program_20 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: T_B[D, D], b: Char) extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: T_B[F, CC_A[F]], b: CC_A[F], c: Byte) extends T_B[CC_B[T_A[Char]], F]

val v_a: T_A[Byte] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B() => 1 
}
}