package Program_25 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_B[E, E], b: Byte, c: T_A[E, E]) extends T_A[T_B[T_B[Byte, Char], T_B[Boolean, Byte]], E]
case class CC_B[F]() extends T_A[T_B[T_B[Byte, Char], T_B[Boolean, Byte]], F]
case class CC_C(a: T_B[T_B[Byte, Char], (Boolean,(Boolean,Int))], b: Boolean) extends T_A[T_B[T_B[Byte, Char], T_B[Boolean, Byte]], Char]
case class CC_D[G, H](a: H) extends T_B[G, H]
case class CC_E[J, I](a: Char) extends T_B[J, I]
case class CC_F[L, K](a: T_B[K, L], b: T_B[K, K], c: CC_E[K, T_B[K, K]]) extends T_B[L, K]

val v_a: T_A[T_B[T_B[Byte, Char], T_B[Boolean, Byte]], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _, _) => 0 
  case CC_C(_, _) => 1 
}
}
// This is not matched: CC_B()