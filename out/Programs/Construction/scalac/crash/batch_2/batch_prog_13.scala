package Program_13 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: T_A[C], b: Boolean, c: T_B[C]) extends T_A[C]
case class CC_B[D](a: D, b: D) extends T_A[D]
case class CC_C[E](a: T_B[E]) extends T_A[E]
case class CC_D[F]() extends T_B[F]
case class CC_E[G](a: Boolean) extends T_B[G]

val v_a: T_B[Byte] = null
val v_b: Int = v_a match{
  case CC_D() => 0 
  case CC_E(_) => 1 
}
}