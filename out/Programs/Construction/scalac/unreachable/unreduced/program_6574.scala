package Program_31 

object Test {
sealed trait T_A[A, B]
sealed trait T_B[C, D]
case class CC_A[E](a: T_A[E, E], b: T_B[E, E], c: Char) extends T_A[T_A[E, E], E]
case class CC_B() extends T_A[T_A[T_A[CC_A[Int], T_A[Char, Int]], T_A[CC_A[Int], T_A[Char, Int]]], T_A[CC_A[Int], T_A[Char, Int]]]
case class CC_C[F](a: T_A[Char, F]) extends T_A[T_A[F, F], F]

val v_a: T_A[T_A[T_A[CC_A[Int], T_A[Char, Int]], T_A[CC_A[Int], T_A[Char, Int]]], T_A[CC_A[Int], T_A[Char, Int]]] = null
val v_b: Int = v_a match{
  case CC_B() => 0 
  case CC_C(_) => 1 
}
}
// This is not matched: CC_A(_, _, _)