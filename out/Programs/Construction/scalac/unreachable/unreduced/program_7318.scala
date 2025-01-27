package Program_10 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_A[E, E]]
case class CC_B[F, G](a: (CC_A[Boolean],CC_A[Int]), b: Boolean, c: CC_A[F]) extends T_A[G, F]
case class CC_C[I, H]() extends T_A[H, I]
case class CC_D[J](a: CC_B[J, J], b: J) extends T_B[(T_A[(Int,Char), Boolean],Int), J]
case class CC_E(a: Char) extends T_B[(T_A[(Int,Char), Boolean],Int), T_A[T_B[Byte, Byte], (Byte,(Boolean,Int))]]
case class CC_F[K]() extends T_B[(T_A[(Int,Char), Boolean],Int), K]

val v_a: T_A[Boolean, Byte] = null
val v_b: Int = v_a match{
  case CC_B((CC_A(_),CC_A(_)), _, CC_A(_)) => 0 
  case CC_C() => 1 
}
}