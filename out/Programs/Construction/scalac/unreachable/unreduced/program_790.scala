package Program_13 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, Byte]) extends T_A[Byte, E]
case class CC_B[F](a: CC_A[F], b: CC_A[F], c: T_A[F, (Boolean,Char)]) extends T_A[T_A[Byte, Int], F]
case class CC_C(a: T_A[Byte, CC_A[Byte]], b: CC_B[CC_B[Boolean]]) extends T_A[Byte, T_B[Byte, CC_B[Byte]]]
case class CC_D[G](a: Boolean, b: CC_A[G], c: Byte) extends T_B[G, (Boolean,T_A[Byte, CC_C])]
case class CC_E(a: T_A[T_A[Byte, Int], CC_B[CC_C]], b: CC_D[Int]) extends T_B[(T_A[Byte, CC_C],Boolean), (Boolean,T_A[Byte, CC_C])]
case class CC_F[H](a: CC_D[H], b: CC_D[H]) extends T_B[H, (Boolean,T_A[Byte, CC_C])]

val v_a: T_B[Byte, (Boolean,T_A[Byte, CC_C])] = null
val v_b: Int = v_a match{
  case CC_D(_, CC_A(_), _) => 0 
  case CC_F(_, _) => 1 
}
}