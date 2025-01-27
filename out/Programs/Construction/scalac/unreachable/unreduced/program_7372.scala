package Program_4 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E]) extends T_A[E, (T_B[Char, (Boolean,Char)],T_A[Boolean, Byte])]
case class CC_B[F](a: T_A[F, F], b: F) extends T_B[Byte, F]
case class CC_C[G](a: (Int,T_A[Boolean, Byte]), b: G, c: T_B[G, G]) extends T_B[G, T_A[G, G]]
case class CC_D[H, I](a: Boolean, b: CC_A[I], c: Boolean) extends T_B[Byte, H]

val v_a: T_B[Byte, Boolean] = null
val v_b: Int = v_a match{
  case CC_B(_, _) => 0 
  case CC_D(_, _, _) => 1 
}
}