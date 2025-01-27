package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D]() extends T_A[D]
case class CC_B[E]() extends T_A[E]
case class CC_C[F](a: Byte, b: CC_B[F], c: Boolean) extends T_A[F]

val v_a: CC_C[Int] = null
val v_b: Int = v_a match{
  case CC_C(_, CC_B(), _) => 0 
}
}