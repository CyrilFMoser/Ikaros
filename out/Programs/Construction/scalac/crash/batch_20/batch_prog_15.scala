package Program_15 

object Test {
sealed trait T_A[A]
sealed trait T_B[B, C]
case class CC_A(a: T_B[T_B[Boolean, Int], T_B[Byte, (Char,Boolean)]], b: T_A[Char]) extends T_A[T_B[T_B[Boolean, Int], T_A[(Byte,Boolean)]]]
case class CC_B[D]() extends T_A[D]
case class CC_C[E](a: T_A[E]) extends T_A[T_B[T_B[Boolean, Int], T_A[(Byte,Boolean)]]]
case class CC_D[G, F](a: T_B[F, F]) extends T_B[G, F]
case class CC_E[I, H]() extends T_B[I, H]
case class CC_F[J, K](a: CC_C[J]) extends T_B[K, J]

val v_a: T_A[Boolean] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
}
}