package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E, F](a: Char, b: T_B[F, E]) extends T_A[E, F]
case class CC_B[G](a: CC_A[G, G]) extends T_A[T_A[G, G], G]
case class CC_C[H]() extends T_A[T_A[H, H], H]
case class CC_D[I](a: T_A[I, I], b: CC_C[I]) extends T_B[I, T_A[T_A[Boolean, Char], T_A[(Boolean,Byte), Char]]]
case class CC_E[J](a: CC_C[CC_A[J, Int]], b: J, c: T_B[J, J]) extends T_B[J, Char]

val v_a: T_A[T_A[Char, Char], Char] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_C() => 1 
}
}
// This is not matched: CC_B(_)