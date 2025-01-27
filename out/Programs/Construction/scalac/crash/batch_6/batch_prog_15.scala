package Program_15 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D, E](a: T_B[E], b: (T_A[(Int,Char), Byte],T_B[Boolean]), c: T_B[E]) extends T_A[T_B[T_B[Int]], D]
case class CC_B[F](a: T_B[F]) extends T_A[T_B[T_B[Int]], F]
case class CC_C[G, H](a: CC_A[H, G], b: H, c: CC_A[G, H]) extends T_A[G, H]
case class CC_D[I](a: T_B[I]) extends T_B[I]

val v_a: CC_D[Byte] = null
val v_b: Int = v_a match{
  case CC_D(_) => 0 
}
}