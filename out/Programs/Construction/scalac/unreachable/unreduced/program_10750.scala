package Program_0 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_B[T_B[Byte]]]
case class CC_B[E](a: Byte) extends T_A[E, T_B[T_B[Byte]]]
case class CC_C[F](a: CC_B[F], b: Char, c: CC_B[F]) extends T_B[F]
case class CC_D[G](a: (CC_C[(Int,Int)],T_B[(Boolean,Char)]), b: T_A[G, G], c: CC_C[G]) extends T_B[G]
case class CC_E[H](a: Boolean, b: H, c: T_B[H]) extends T_B[H]

val v_a: T_A[Byte, T_B[T_B[Byte]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_C(_, _, CC_B(_))) => 0 
  case CC_A(CC_D(_, _, CC_C(_, _, _))) => 1 
  case CC_A(CC_E(_, _, CC_C(_, _, _))) => 2 
  case CC_A(CC_E(_, _, CC_E(_, _, _))) => 3 
  case CC_B(_) => 4 
}
}
// This is not matched: CC_A(CC_E(_, _, CC_D(_, _, _)))