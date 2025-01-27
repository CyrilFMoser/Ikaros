package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E]) extends T_A[E, T_A[T_A[E, E], E]]
case class CC_B[F](a: (T_A[Byte, Byte],CC_A[Int]), b: Int, c: T_B[CC_A[F], F]) extends T_B[CC_A[F], F]
case class CC_C[G](a: Char, b: Boolean, c: CC_B[T_B[G, Int]]) extends T_B[CC_A[G], G]

val v_a: CC_B[Char] = null
val v_b: Int = v_a match{
  case CC_B(_, _, CC_B((_,_), _, _)) => 0 
  case CC_B(_, _, CC_C(_, _, CC_B(_, _, _))) => 1 
}
}