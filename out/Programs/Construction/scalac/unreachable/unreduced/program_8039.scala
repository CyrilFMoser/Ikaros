package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C]
case class CC_A[D](a: T_B[D]) extends T_A[D, T_A[D, T_A[D, D]]]
case class CC_B[E](a: T_A[E, E]) extends T_A[E, T_A[E, T_A[E, E]]]
case class CC_C[F](a: CC_A[F], b: T_B[F], c: T_A[F, F]) extends T_A[F, T_A[F, T_A[F, F]]]
case class CC_D[G](a: (Int,Byte)) extends T_B[G]

val v_a: T_A[Char, T_A[Char, T_A[Char, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(CC_D((_,_))) => 0 
  case CC_B(_) => 1 
  case CC_C(_, _, _) => 2 
}
}