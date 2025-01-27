package Program_12 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[Int, T_A[Byte]]) extends T_A[(T_B[Byte, Boolean],Int)]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: CC_A) extends T_B[E, T_A[E]]
case class CC_D[F](a: CC_B[F]) extends T_B[F, T_A[F]]

val v_a: T_B[Byte, T_A[Byte]] = null
val v_b: Int = v_a match{
  case CC_C(CC_A(_)) => 0 
  case CC_D(CC_B()) => 1 
}
}