package Program_15 

package Program_8 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[F, E, G](a: (Char,Char), b: T_A[Int, Byte], c: T_A[F, F]) extends T_A[F, E]
case class CC_B[H]() extends T_A[H, T_B[Boolean, Boolean]]
case class CC_C[I](a: T_A[I, I], b: T_A[I, (Char,Char)], c: CC_B[I]) extends T_B[Char, I]
case class CC_D[J, K](a: CC_B[K]) extends T_B[Char, J]

val v_a: T_B[Char, Boolean] = null
val v_b: Int = v_a match{
  case CC_D(CC_B()) => 0 
  case CC_C(CC_A(_, _, _), _, _) => 1 
  case CC_C(CC_A(_, _, _), _, CC_B()) => 2 
}
}
// This is not matched: (CC_D Boolean (T_B Boolean Boolean) Wildcard (T_B Char Boolean))
// This is not matched: (CC_B Wildcard T_A)