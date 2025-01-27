package Program_22 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A[D](a: Boolean, b: D, c: D) extends T_A[D]
case class CC_B(a: T_A[T_A[Byte]], b: T_A[Char]) extends T_A[T_A[Byte]]
case class CC_C(a: Byte) extends T_A[T_A[Byte]]
case class CC_D[E]() extends T_B[E, T_A[(CC_B,CC_B)]]
case class CC_E[F](a: (Boolean,T_A[(Char,Byte)]), b: CC_D[F], c: (Int,CC_C)) extends T_B[F, T_A[(CC_B,CC_B)]]

val v_a: CC_C = null
val v_b: Int = v_a match{
  case CC_C(_) => 0 
}
}