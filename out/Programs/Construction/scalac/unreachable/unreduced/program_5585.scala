package Program_14 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: (T_B[Byte, Byte],Byte)) extends T_A[T_A[T_B[Boolean, Char], T_B[Int, Int]], E]
case class CC_B(a: (CC_A[Char],T_A[Byte, Int]), b: T_B[Int, T_B[Boolean, Byte]]) extends T_A[T_A[T_B[Boolean, Char], T_B[Int, Int]], T_A[CC_A[Int], T_B[Boolean, Char]]]
case class CC_C[F, G, H](a: T_A[F, F], b: T_A[F, F]) extends T_A[F, G]
case class CC_D[I](a: CC_C[I, I, I]) extends T_B[I, CC_A[I]]
case class CC_E[J](a: CC_A[J]) extends T_B[J, CC_A[J]]
case class CC_F[K](a: Char, b: T_A[K, Boolean]) extends T_B[K, CC_A[K]]

val v_a: T_B[Int, CC_A[Int]] = null
val v_b: Int = v_a match{
  case CC_D(CC_C(CC_C(_, _), CC_C(_, _))) => 0 
  case CC_E(CC_A((_,_))) => 1 
  case CC_F('x', CC_C(_, CC_C(_, _))) => 2 
}
}
// This is not matched: CC_F(_, CC_C(_, CC_C(_, _)))