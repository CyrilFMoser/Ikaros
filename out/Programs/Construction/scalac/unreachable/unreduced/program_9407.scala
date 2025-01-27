package Program_20 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: E, b: T_A[T_A[E, E], E], c: Boolean) extends T_A[E, (T_B[Char, Char],T_A[Boolean, Byte])]
case class CC_B[F](a: T_B[F, F]) extends T_A[F, (T_B[Char, Char],T_A[Boolean, Byte])]
case class CC_C[G, H]() extends T_B[G, H]

val v_a: T_A[Boolean, (T_B[Char, Char],T_A[Boolean, Byte])] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_B(CC_C()) => 1 
}
}