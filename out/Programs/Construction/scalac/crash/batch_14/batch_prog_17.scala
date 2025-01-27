package Program_17 

object Test {
sealed trait T_A[A]
sealed trait T_B[B]
case class CC_A[C](a: C, b: Boolean, c: T_A[C]) extends T_A[C]
case class CC_B[D]() extends T_A[D]
case class CC_C[E]() extends T_A[E]
case class CC_D[F, G](a: Char) extends T_B[F]
case class CC_E() extends T_B[(Boolean,(Int,Boolean))]
case class CC_F() extends T_B[(Boolean,(Int,Boolean))]

val v_a: T_B[Int] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}