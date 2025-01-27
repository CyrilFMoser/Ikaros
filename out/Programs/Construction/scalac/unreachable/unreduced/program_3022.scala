package Program_24 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: Char, b: T_B[E, E]) extends T_A[T_A[T_B[Int, Int], T_B[Char, Byte]], E]
case class CC_B(a: T_A[CC_A[(Boolean,Int)], T_A[Char, Byte]], b: (CC_A[Char],T_B[Int, Byte]), c: (Boolean,CC_A[Char])) extends T_A[T_A[T_B[Int, Int], T_B[Char, Byte]], T_B[T_A[Int, Char], T_B[Int, Char]]]
case class CC_C[F](a: F, b: T_B[F, F], c: CC_B) extends T_A[T_A[T_B[Int, Int], T_B[Char, Byte]], F]
case class CC_D[G](a: CC_A[G], b: CC_B, c: T_A[G, G]) extends T_B[G, CC_B]
case class CC_E[H]() extends T_B[H, CC_B]
case class CC_F[I, J](a: CC_A[J]) extends T_B[J, I]

val v_a: T_A[T_A[T_B[Int, Int], T_B[Char, Byte]], T_B[T_A[Int, Char], T_B[Int, Char]]] = null
val v_b: Int = v_a match{
  case CC_A(_, _) => 0 
  case CC_B(_, _, (_,CC_A(_, _))) => 1 
}
}
// This is not matched: CC_C(_, _, _)